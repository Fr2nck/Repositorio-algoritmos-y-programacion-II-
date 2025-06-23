package Arrays.Arrayuni.PracticaArraysUnidimencionales02;
public class FranckMarquez_ActividadesArray03 {
    /*Ejercicio 3 Realiza un programa que pida 10 números por teclado y que los almacene
    en un array. A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
    utilizando para ello una tabla. Seguidamente el programa pasará los primos a las primeras 
    posiciones, desplazando el resto de números (los que no son primos) de tal forma que
    no se pierda ninguno. Al final se debe mostrar el array resultante.*/
    public static void main(String[] args) {
        int[] numeros = new int [10];
        //pedir ingresar 10 numeros enteros
        System.out.println("Ingrese 10 numeros enteros para el arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero para la posición " + i + ":");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        //Imprimir el array en estructura de tabla
        System.out.println("El array contiene los siguientes valores");
        System.out.println("Indice " + "Número");  
        for (int i = 0; i < numeros.length; i++) {
            System.out.print( i + "      ");
            System.out.println(numeros[i]);
        }
        //Arreglos y contadores auxiliares
        int[] primos = new int[numeros.length];
        int[] noprimos = new int[numeros.length];
        int indexprimos = 0;
        int indexnoprimos = 0;
        //Determinar si un numero es primo o no
        for (int i = 0; i < numeros.length; i++) {
            //Si un numero es menor o igual a 1 se determina que no es primo
            if (numeros[i]<= 1) {
                noprimos[indexnoprimos++] = numeros[i];
            //Si un numero es igual a 2 es un numero primo
            } else if (numeros[i] == 2) {
                primos[indexprimos++] = numeros[i];          
            } else {
                //Variable auxiliar
                boolean esPrimo = true;
                //verificar si el numero tiene mas divisores ademas de 1 y de si mismo
                for (int j = 2; j <= Math.sqrt(numeros[i]) ; j++) {
                    if (numeros[i] % j == 0) {
                        esPrimo = false;
                        break;                       
                    }
                }
                if (esPrimo) {
                    primos[indexprimos++] = numeros[i];
                } else{
                    noprimos[indexnoprimos++] = numeros[i];
                }              
            }
        }
        //Arreglo y contador auxiliar
        int[] primosynoprimos =new int[indexprimos + indexnoprimos];
        int indexprimosynoprimos = 0;
        //Agregamos los elementos de ambos arreglos al arreglo final
        for (int i = 0; i < indexprimos; i++) {
            primosynoprimos[indexprimosynoprimos++] = primos[i];
        }
        for (int i = 0; i < indexnoprimos; i++) {
            primosynoprimos [indexprimosynoprimos++] = noprimos[i];
        }
        //Imprimir el array final en estructura de tabla
        System.out.println("El arreglo reordenado tiene los siguientes valores");
        System.out.println("Indice " + "Número");  
        for (int i = 0; i < indexprimos + indexnoprimos; i++) {
            System.out.print( i + "      ");
            System.out.println(primosynoprimos[i]);
        }
    }
}