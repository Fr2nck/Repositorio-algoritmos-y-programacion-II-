public class Pregunta02 {
    /*Realiza un programa que pinte un valle tal como se muestra en los ejemplos. 
    El usuario debe introducir la altura de la figura. Podemos suponer que el usuario 
    introduce una altura mayor o igual a 3.
    Ejemplo 1:
    Introduzca la altura de la figura: 5
    *      *
    * *  * *
    *  **  *
    ********
    Ejemplo 2:
    Introduzca la altura de la figura: 3
    *    *
    **  **
    ******
    */
    public static void main(String[] args) {
        // Ingresar la altura del valle
        System.out.print("Ingresa la altura del triangulo: ");
        int altura = Integer.parseInt(System.console().readLine());
        String caracter = "*";
    
        // Llamar a la funcion dibujar valle
        DibujarTriangulo(caracter, altura);
        }
    // Función para imprimir el valle 
    public static void DibujarTriangulo(String caracter, int altura) {
        for (int i = altura; i >= 1; i--) {
            linea(caracter, i);
        }
    }
    // Función para imprimir las lineas con el caracter 
    public static void linea(String caracter, int repeticiones) {
        for (int i = 0; i <  repeticiones; i++) {
        System.out.print(caracter + "  ");
        }
        System.out.println();
    }
}