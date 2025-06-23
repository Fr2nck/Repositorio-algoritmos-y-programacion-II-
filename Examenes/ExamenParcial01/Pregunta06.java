package Examenes.ExamenParcial01;
/*Pregunta 6: Crea un programa que dibuje un triángulo relleno de asteriscos (*) 
o de cualquier otro carácter que elija el usuario, según la altura que este ingrese. 
Utiliza una función para hacer el código más sencillo y modular. Por ejemplo, puedes 
crear una función linea(char caracter, int repeticiones) que imprima una línea con el 
carácter especificado, repitiéndo el número de veces indicado. Luego, utiliza esta 
función dentro de un bucle para imprimir las líneas del triángulo, donde cada línea 
tendrá un número creciente de caracteres, según la altura especificada por el usuario.*/
public class Pregunta06{    
    public static void main(String[] args) {
        // Ingresar la altura del triangulo
        System.out.print("Ingresa la altura del triangulo: ");
        int altura = Integer.parseInt(System.console().readLine());

        // Ingresar el caracter para el triangulo
        System.out.print("Ingresa un carácter: ");
        char caracter = System.console().readLine().charAt(0);

        // Llamar a la funcion dibujar triangulo
        DibujarTriangulo(caracter, altura);
    }

    // Función para imprimir el triángulo 
    public static void DibujarTriangulo(char caracter, int altura) {
        for (int i = altura; i >= 1; i--) {
            linea(caracter, i);
        }
    }

    // Función para imprimir las lineas con el caracter 
    public static void linea(char caracter, int repeticiones) {
        for (int i = 0; i <  repeticiones; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}
