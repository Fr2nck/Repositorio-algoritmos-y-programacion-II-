package Examenes.ExamenParcial01;
/*Pregunta 5: Crea una función que convierta cada dígito de un número n en su palabra 
correspondiente y devuelva el resultado como una cadena de caracteres. Por ejemplo, 
el número 470213 se convertiría en: "cuatro, siete, cero, dos, uno, tres". Ten en cuenta
 que las palabras deben estar separadas por comas, pero no debe haber una coma al final
  de la última palabra. Utiliza esta función en un programa para comprobar su correcto 
  funcionamiento. Recuerda que no se debe mostrar nada desde la función; la salida debe 
  generarse exclusivamente en el programa principal utilizando la instrucción print.*/
public class Pregunta05{
      public static void main(String[] args) {
        // Ingresar un numero
        System.out.print("Ingresa un número entero: ");
        int numero = Integer.parseInt(System.console().readLine());

        // Llama a la funcion convertir el número a palabras
        String resultado = convertirAPalabras(numero);

        // Imprimir el resultado
        System.out.println("Número en palabras: " + resultado);
        
    }

    // Función que convierte un número en palabras
    public static String convertirAPalabras(int numero) {

      // Array de palabras para los dígitos del 0 al 9
      String[] palabras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
      
      // Inicializamos un StringBuilder para agregar los numeros como palabras
      StringBuilder resultado = new StringBuilder();

      // Convertimos el numero entero (int) en cadena de "texto"      
      String numeroStr = String.valueOf(numero);

      // Recorre los digitos del numero ingresado, obtiene la palabra correspondiente al numero y lo agrega al StringBuilder
      for (int i = 0; i < numeroStr.length(); i++) {
          int digito = Character.getNumericValue(numeroStr.charAt(i));
          resultado.append(palabras[digito]);

          // Agregar una separador si no es el último dígito
          if (i < numeroStr.length() - 1) {
              resultado.append(", ");
          }
      }
      return resultado.toString();
  }
}
