package Arrays.Arrayuni.PracticaArraysUnidimencionales01;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Un programa que pida 10 numeros por teclado, luego muestre
        //los numeros introducidos, ademas debe mostrar el maximo y minimo
        int[] numeros = new int[10];
        //Estructura para ingresar 10 numeros manualmente
        System.out.println("Ingrese 10 numeros enteros para el arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero para la posición " + i + ":");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        //Estructura para encontrar el numero mas alto
        int max = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        System.out.println("El numero con el valor mas alto es: " + max);
        //Estructura para encontrar el numero minimo
        int min = max;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("El numero con el valor mas bajo es: " + min);
        //Estructura para imprimir todos los valores del arreglo
        System.out.println("El arreglo tiene los siguiente elementos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]" + " ");
        }
    }
}
