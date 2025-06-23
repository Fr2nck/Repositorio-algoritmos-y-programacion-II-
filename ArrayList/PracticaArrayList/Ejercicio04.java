package ArrayList.PracticaArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*Ejercicio 4 Realiza un programa equivalente al anterior pero en esta ocasión, 
el programa debe ordenar palabras en lugar de números.*/
public class Ejercicio04{
    public static void main(String[] args) {
        //Inicializamos el arrayList
        ArrayList<String> ListPalabras = new ArrayList<String>();

        //Agregamos elementos a la lista
        System.out.println("Ingresa 10 palabras para agregarlas a la lista: ");
        for (int i = 1 ; i <= 3; i++) {
            String palabra = System.console().readLine();
            ListPalabras.add(palabra);
        }

        //Ordenar los elementos del ArrayList
        Collections.sort(ListPalabras);

        // Mostrar todos los elementos del ArrayList
        System.out.println("El ArrayList contiene los siguientes elementos: ");
        for (String palabras:ListPalabras){
            System.out.println(palabras);
        }
    }
    
}
