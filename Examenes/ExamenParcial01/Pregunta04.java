package Examenes.ExamenParcial01;
/*Pregunta 4: Crea una función que permita convertir un número entero n al sistema de
 codificación Morse y devolver el resultado como una cadena de caracteres. Por ejemplo,
  el número 213 se convertirá en .._ _ _._ _ _ _..._ _ en código Morse.En el 
  programa principal, utiliza esta función para verificar su funcionamiento, mostrando 
  el resultado por pantalla. Ten en cuenta que no debe mostrarse ninguna salida desde 
  la función; la impresión en pantalla debe realizarse únicamente desde el programa 
  principal utilizando la instrucción print.*/
public class Pregunta04{  
    public static void main(String[] args) {
        //Ingresar un numero
        System.out.print("Ingresa un número entero: ");
        int numero = Integer.parseInt(System.console().readLine());

        // Llamar a la funcion convertir al sistema Morse
        String resultado = convertirAMorse(numero);

        // Imprimir el resultado
        System.out.println("Número en código Morse: " + resultado);
    }

    // Función que convierte un número al sistema Morse
    public static String convertirAMorse(int numero) {
        
        //Array de coficicacion para el numero morce 0 al 9
        String[] morse = {"_ _ _ _ _", "._ _ _ _", ".._ _ _", "..._ _", "...._", ". . . . .", "_....", "_ _...", "_ _ _..", "_ _ _ _."};
      
        // Inicializamos un StringBuilder para agregar los numeros en codigo morce
        StringBuilder resultado = new StringBuilder();

        // Convertimos el numero entero (int) en cadena de "texto" 
        String numeroStr = String.valueOf(numero);

        // Recorre los digitos del numero ingresado, obtiene el codigo correspondiente al numero y lo agrega al StringBuilder
        for (int i = 0; i < numeroStr.length(); i++) {
            int digito = Character.getNumericValue(numeroStr.charAt(i));
            resultado.append(morse[digito]);

            // Agregar un separador entre los códigos Morse de los dígitos
            if (i < numeroStr.length() - 1) {
                resultado.append(" ");
            }
        }
        return resultado.toString();
    }    
}
