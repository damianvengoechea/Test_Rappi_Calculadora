package co.com.rappicalculadoratest.interactions;

import co.com.rappicalculadoratest.user_interfaces.Calculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Seleccionar implements Interaction {

    private String operacion;

    public Seleccionar(String operacion) {
        this.operacion = operacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            if (String.valueOf(operacion).equals("suma")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_SUMAR));
            } else if (String.valueOf(operacion).equals("resta")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_RESTAR));
            } else if (String.valueOf(operacion).equals("multiplicacion")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_MULTIPLICAR));
            } else if (String.valueOf(operacion).equals("division")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIVIDIR));
            }
    }

    public static Seleccionar operador (String operacion){
        return instrumented(Seleccionar.class, operacion);
    }
}