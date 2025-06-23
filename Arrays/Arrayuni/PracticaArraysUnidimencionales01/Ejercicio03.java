package Arrays.Arrayuni.PracticaArraysUnidimencionales01;
public class Ejercicio03 {
        /*Ejercicio 3. Escribe un programa que genere 100 numeros aleatorios del 0 al 20 y que 
        los muestre en pantalla seperados por espacios. El programa pedira entonces por teclado dos
        valores y a continuacion cambiara cambviara todas las ocurrencias del primer valor por el segundo
        en la lista generada anteriormente. los numeros que se han cambiado deben aparecer entre comillas. */
    public static void main(String[] args) {
        int[] numeros = new int[100];
        //Estructura repetitiva para ingresar numeros de forma automatica
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 21);
        }
        //Estructura para imprimir todos los valores del arreglo        
        System.out.println("El arreglo tiene los siguiente elementos:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
        //Estructura para ayudar a imprimir el array en grupos de 10
        if ((i+1) % 10 == 0) {
            System.out.println();
        }
        }        
        System.out.println(" ");
        System.out.println("Ingresa el valor que quieres cambiar: ");
        int antiguo = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el valor al cual los quieres cambiar: ");
        int nuevo = Integer.parseInt(System.console().readLine());
        System.out.println("Se cambiaran los valores: " + antiguo +" por " + nuevo );
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == antiguo) {
                numeros[i] = nuevo;
                System.out.print(" *" + numeros[i] + "*");
            } else {
                System.out.print(" [" + numeros[i] + "]");
            }                        
        }
    }
}