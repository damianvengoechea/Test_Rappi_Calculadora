package co.com.rappicalculadoratest.tasks;

import co.com.rappicalculadoratest.interactions.Digitar;
import co.com.rappicalculadoratest.interactions.Seleccionar;
import co.com.rappicalculadoratest.user_interfaces.Calculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarOperacion implements Task {

    private int numero1;
    private int numero2;
    private String operacion;

    public RealizarOperacion(int numero1, int numero2, String operacion) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacion = operacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Digitar.numero(numero1),
                Seleccionar.operador(operacion),
                Digitar.numero(numero2),
                Click.on(Calculadora.BTN_IGUAL)
        );
    }

    public static Performable conDatos(int numero1, int numero2, String operacion) {
        return instrumented(RealizarOperacion.class, numero1, numero2, operacion);
    }
}
