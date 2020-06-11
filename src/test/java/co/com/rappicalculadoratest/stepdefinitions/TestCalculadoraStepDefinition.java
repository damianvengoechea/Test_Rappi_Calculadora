package co.com.rappicalculadoratest.stepdefinitions;

import co.com.rappicalculadoratest.questions.Resultado;
import co.com.rappicalculadoratest.tasks.RealizarOperacion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class TestCalculadoraStepDefinition {

    @Before
    public void configuracion() {
        setTheStage(new OnlineCast());
        theActorCalled("Damian");
    }

    @Cuando("^damian ingrese los numeros (\\d+) y (\\d+) y la \"([^\"]*)\"$")
    public void damianIngreseLosNumerosYYLa(int numero1, int numero2, String operacion) {
       theActorInTheSpotlight().attemptsTo(RealizarOperacion.conDatos(numero1, numero2, operacion));
    }

    @Entonces("^podriamos ver el resultado (.*)$")
    public void podriamosVerElResultado(int resultadoEsperado) {
        theActorInTheSpotlight().should(seeThat(Resultado.es(), equalTo(String.valueOf(resultadoEsperado))));
    }
}
