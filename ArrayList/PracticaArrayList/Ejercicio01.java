package ArrayList.PracticaArrayList;

import java.util.ArrayList;

/*Ejercicio 1 Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra todo el 
ArrayList sin usar ningún índice.*/
public class Ejercicio01 {
    public static void main(String[] args) {
        // Inicializamos el ArrayList
        ArrayList<String> ListCompañeros = new ArrayList<String>();
        System.out.println("La lista de mis compañeros es la siguiente:");

        // Agregamos elementos al ArrayList
        ListCompañeros.add("Andree");
        ListCompañeros.add("Brumel");
        ListCompañeros.add("Nayeli");
        ListCompañeros.add("Shamira");
        ListCompañeros.add("Einer");
        ListCompañeros.add("Gregory");

        // Mostramos todos los elementos de ArrayList (Sin usar un indice)
        for (String nombres:ListCompañeros){
            System.out.println(nombres);
        }
    }
}