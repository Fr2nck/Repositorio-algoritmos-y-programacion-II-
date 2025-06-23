package Arrays.Arrayuni.PracticaArraysUnidimencionales02;

public class FranckMarquez_ActividadesArray05 {
    /*Ejercicio 5 Escribe un programa que rellene un array de 100 elementos
    con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
    A continuación, el programa mostrará el array y preguntará si el usuario
    quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el array
    escribiendo el número destacado entre dobles asteriscos.*/
    public static void main(String[] args) {
        int[] numeros = new int[100];
        //Ingresar numeros del (0 al 100) de forma automatica
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 501);
            }
        //Imprimir el arreglo generado
        for (int i = 0; i < numeros.length; i++) {
        System.out.print( numeros[i] + " ");
        }
        //Pedir si quiere resaltar el maximo o el minimo
        System.out.println(" ");
        System.out.println("Que valor quieres Resaltar: 1 = minimo, 2 = maximo");
        int aux = Integer.parseInt(System.console().readLine());
        //Definir cual es el numero de maximo o minimo valor
        int min = 500 ;
        int max = 0;
        if (aux == 1) {
            for (int i = 0; i < numeros.length; i++) {
                if (min > numeros[i] ) {
                    min = numeros[i];
                }
            }
        }
        if (aux ==  2) {
            for (int i = 0; i < numeros.length; i++) {
                if (max < numeros[i]) {
                    max = numeros[i];
                }
            }
        } 
        //Imprimir el arreglo resaltando el maximo o minimo
        if (aux == 1) {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == min) {
                    System.out.print(" ** " + numeros[i] + " ** ");
                } else{
                    System.out.print(" " + numeros[i] + " ");
                }
            }
        }
        if (aux == 2) {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == max) {
                    System.out.print(" ** " + numeros[i] + " ** ");
                } else{
                    System.out.print(" " + numeros[i] + " ");
                }
            }
        }
    }
}
