package ArrayList;
import java.util.ArrayList;
public class ArrayList01 {
    public static void main(String[] args) {
        // Inicializamos el arrayList
        ArrayList<String> myList = new ArrayList<String>();

        // Imprimimos la cantidad de elementos de la lista
        System.out.println("Mi lista inicial tiene " + myList.size() + " elementos");
        
        // Agregamos elementos a la lista
        myList.add("Rojo");
        myList.add("Verde");
        myList.add("Morado");
        myList.add("Azul");
        myList.add("Morado");
        myList.add("Marron");
        
        // Imprimimos la lista y la cantidad de elementos de la lista
        // System.out.println(myList);
        System.out.println("Mi lista final tiene " + myList.size() + " elementos");

        // Imprimimos un elemento en especifico
        System.out.println("El segundo elemento es el color: " + myList.get(1));

        // Imprimimos todos los elementos de la lista
        System.out.println("Los elementos de la lista son:");
        /*
        for (int i = 0; i < myList.size(); i++) {
        System.out.println(myList.get(i));
        }
        */

        // Otra forma de imprimir los elementos de una lista
        for (String color:myList){
            System.out.println(color);
        }

        //Pedimos un color para verificar en la lista
        System.out.println("Ingresa un color para verificarlo en la lista: ");
        String NuevoColor = System.console().readLine();

        // Determinar si un elemento se encuentra en la lista
        if (myList.contains(NuevoColor)) {
            System.out.println("El color "+ NuevoColor +"blanco existe en la lista de colores");
        }else{
            System.out.println("El color " + NuevoColor + "no existe en la lista de colores");
            myList.add(NuevoColor);
        }

        for (String color:myList){
            System.out.println(color);
        }
        /* 
        ArrayList que contenga numeros*
        //Inicializamos el arrayList
        ArrayList<Integer> myListNumbers = new ArrayList<Integer>();

        //Agregamos elementos a la lista
        for (int i = 1 ; i <= 5; i++) {
            myListNumbers.add(i);
        }

        //Imprimir la lista
        System.out.println("La lista contiene los siguiente elementos: " + myListNumbers );
        */
    }
}
