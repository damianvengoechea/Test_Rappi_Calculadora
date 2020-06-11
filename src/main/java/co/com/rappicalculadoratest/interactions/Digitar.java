package co.com.rappicalculadoratest.interactions;

import co.com.rappicalculadoratest.user_interfaces.Calculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Digitar implements Interaction {

    private int numero;
    private String digitos;
    private char[] arregloDigitos;

    public Digitar(int numero) {
        this.numero = numero;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        digitos = String.valueOf(numero);
        arregloDigitos = digitos.toCharArray();

        for(int i=0; i<arregloDigitos.length; i++) {
            if(String.valueOf(arregloDigitos[i]).equals("0")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_0));
            }
            else if (String.valueOf(arregloDigitos[i]).equals("1")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_1));
            }
            else if (String.valueOf(arregloDigitos[i]).equals("2")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_2));
            }
            else if (String.valueOf(arregloDigitos[i]).equals("3")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_3));
            }
            else if (String.valueOf(arregloDigitos[i]).equals("4")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_4));
            }
            else if (String.valueOf(arregloDigitos[i]).equals("5")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_5));
            }
            else if (String.valueOf(arregloDigitos[i]).equals("6")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_6));
            }
            else if (String.valueOf(arregloDigitos[i]).equals("7")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_7));
            }
            else if (String.valueOf(arregloDigitos[i]).equals("8")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_8));
            }
            else if (String.valueOf(arregloDigitos[i]).equals("9")) {
                actor.attemptsTo(Click.on(Calculadora.BTN_DIGITO_9));
            }
        }
    }

    public static Digitar numero(int numero) {
        return instrumented(Digitar.class, numero);
    }
}
