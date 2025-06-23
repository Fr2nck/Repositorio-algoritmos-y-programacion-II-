package ArrayList;

import java.util.ArrayList;

import Poo.Gato.Gato;

public class ArrayList02 {
    public static void main(String[] args) {

        // Inicializamos un ArrayList de objetos
        ArrayList<Gato> g = new ArrayList<>();
        
        // Agregamos objetos al ArrayList
        g.add(new Gato("garfield", "negro", "siames", "Masculino", 5, 12));
        g.add(new Gato("michifus", "amarillo", "angora", "femenino", 4, 10));
        g.add(new Gato("pancho", "moteado", "siames", "Masculino", 5,11));
        g.add(new Gato("roro", "rubia", "siames", "femenino", 6, 8));
        g.add(new Gato("chalo", "negro", "siames", "Masculino", 3, 10));

        // Mostramos todos un elemento especifico del ArrayList (Nombre)
        System.out.println("Hola te presento a mis gatos: ");
        for (Gato Gatos:g){
            System.out.println(Gatos.getnombre() + ":  " + Gatos.maullido());
        }

        // Ordenar a los gatos por su nombre

    }
}