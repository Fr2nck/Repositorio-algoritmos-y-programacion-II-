public class Pregunta01 {
    /*Escribe una función en Java con la siguiente firma:
    public String convierteEnPalabras(int n)
    Esta función debe convertir cada dígito del número entero n en su correspondiente 
    representación en palabras y devolver el resultado como una cadena de caracteres. 
    Los nombres de los dígitos deben estar separados por comas, sin una coma final. 
    Por ejemplo, si n = 470213, la función debe devolver:
    "cuatro, siete, cero, dos, uno, tres"
    Implementa un programa que llame a esta función para verificar su correcto funcionamiento.
    La función no debe imprimir nada en pantalla; la impresión debe realizarse únicamente desde 
    el programa principal.*/
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