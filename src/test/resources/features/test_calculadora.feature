#language: es

Característica: : Realizar operaciones basicas
  Como usuario de la aplicación móvil
  Yo quiero realizar varias operaciones basicas matemáticas

    Esquema del escenario: realizar operaciones basicas como la suma resta multiplicacion y division
      Cuando damian ingrese los numeros <numero1> y <numero2> y la <operacion>
      Entonces podriamos ver el resultado <resultadoEsperado>

      Ejemplos:
        | numero1 | numero2 | operacion        | resultadoEsperado |
        | 11      | 5       | "multiplicacion" | 55                |
        | 7       | 10      | "suma"           | 17                |
        | 30      | 2       | "division"       | 15                |
        | 25      | 22      | "resta"          | 3                 |



