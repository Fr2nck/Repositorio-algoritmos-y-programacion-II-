package ArrayList.PracticaArrayList;

import java.util.ArrayList;

/*Ejercicio 2 Realiza un programa que introduzca valores aleatorios (entre 0 y 100) 
en un ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos 
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20 
elementos ambos inclusive.*/
public class Ejercicio02 {
    public static void main(String[] args) {
        
        // Inicializamos el ArrayList
        ArrayList<Integer> ListNumeros = new ArrayList<Integer>();

        //Agregar una variable auxiliar
        int LongArrayList =  10 + (int)(Math.random() * 10);
        System.out.println("La longitud del ArrayList es: " + LongArrayList);

        // Agregamos numeros aleatorios al ArrayList
        for (int i = 0; i < LongArrayList; i++) {
            ListNumeros.add((int) (Math.random() * 100));
        }

        // Mostrar todos los elementos del ArrayList
        System.out.println("Los elementos del ArrayList son:");
        for (Integer numeros:ListNumeros){
            System.out.println(numeros);
        }

    }
}
