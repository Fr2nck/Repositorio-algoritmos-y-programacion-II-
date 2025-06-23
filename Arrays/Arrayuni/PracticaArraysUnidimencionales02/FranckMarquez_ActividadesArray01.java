package Arrays.Arrayuni.PracticaArraysUnidimencionales02;
public class FranckMarquez_ActividadesArray01 {
    /*Ejercicio 1 Realiza un programa que pida 8 números enteros y que luego 
    muestre esos números junto con la palabra “par” o “impar” según proceda.*/
    public static void main(String[] args) {
        int[] numeros = new int [8];
        //Estructura que pide ingresar 8 numeros de forma manual
        System.out.println("Ingrese 8 numeros enteros para el arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero para la posición " + i + ":");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println();
        //Estructura para identificar si el numero es par o no
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("El numero " + numeros[i] +" es par");
            } else {
                System.out.println("El numero " + numeros[i] +" es impar");
            }
        }
    }
}
