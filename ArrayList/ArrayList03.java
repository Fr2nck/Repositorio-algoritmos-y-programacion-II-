package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList03 {
    public static void main(String[] args) {
        
        // Inicializar el ArrayList
        ArrayList<Integer> num = new ArrayList<Integer>();

        // Agregar elementos al ArrayList
        num.add(86);
        num.add(78);
        num.add(95);
        num.add(10);
        num.add(4);
        
        // Mostrar Los elementos del ArrayList
        System.out.println("Numeros en el orden original:");
        for(int numero:num){
            System.out.println(numero);
        }

        // Ordenar los elementos del ArrayList
        Collections.sort(num);

        //Mostrar la lista con los numeros ordenados
        System.out.println("Los numeros ordenados son:");
        for(int numeroOrdenado:num){
            System.out.println(numeroOrdenado);
        }
    }
}
