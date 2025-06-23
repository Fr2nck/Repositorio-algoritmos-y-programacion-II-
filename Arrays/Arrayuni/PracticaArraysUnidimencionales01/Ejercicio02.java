package Arrays.Arrayuni.PracticaArraysUnidimencionales01;
public class Ejercicio02 {
    /*Ejercicio 2. Escribe un programa que lea 15 numeros por teclado y que los almacene 
en un array, rota los elementos de ese array, es decir, el elemento de la posicion 0 debe pasar 
a la posición 1, el de la 1 a la 2, etc. el numero que se encuentra en la ultima posicion
debe pasar a la posicion 0. Finalmente muestre el contenido del array.*/
    public static void main(String[] args) {
        int[] numeros = new int[15];
        //Estructura para ingresar 15 numeros manualmente
        System.out.println("Ingrese 15 numeros enteros para el arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero para la posición " + i + " del arreglo:");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        //Estructura para imprimir los valores del arreglo ingresado
        System.out.println("Los valores ingresados al arreglo son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]" + " ");
        }
        //Estructura para reordenar los valores del arreglo con la ayuda de una variable auxiliar
        int aux = numeros[numeros.length-1];
        System.out.println("El numero auxiliar es: " + aux);
        for (int i = numeros.length-1; i > 0; i--) {
            numeros[i] = numeros[i-1]; 
        }
        numeros[0] = aux;
        //Estructura para imprimir los valores del arreglo reordenado
        System.out.println(" ");
        System.out.println("Los valores reordenados del arreglo son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]" + " ");
        }
    }
}
