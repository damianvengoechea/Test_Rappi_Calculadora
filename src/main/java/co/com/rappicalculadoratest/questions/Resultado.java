package co.com.rappicalculadoratest.questions;

import co.com.rappicalculadoratest.user_interfaces.Calculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Resultado implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return Calculadora.RESULTADO_OPERACION.resolveFor(actor).getText();
    }

    public static Resultado es() {
        return new Resultado();
    }
}
