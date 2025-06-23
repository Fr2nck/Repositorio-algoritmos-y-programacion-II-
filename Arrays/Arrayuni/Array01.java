package Arrays.Arrayuni;

public class Array01 {
    public static void main(String[] args) {
        // Definiendo un array
        int[] numeros;
        // reservamos 4 espacios en memoria
        numeros = new int[4];
        // int[] numeros1 = new int[4];
        // Llenando el array con valores enteros
        numeros[0] = 20;
        numeros[1] = -36;
        numeros[2] = 0;
        numeros[3] = 100;
        // Mostrar los valores del arreglo
        System.out.println("Los valores del array son: ");
        System.out.print(numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3]);
        //Definir una variable para sumar dos valores
        int suma = numeros[1] + numeros[3];
        System.out.println("\nLa suma del 2do y 4to elemento del array es: " + suma);
    }
}
