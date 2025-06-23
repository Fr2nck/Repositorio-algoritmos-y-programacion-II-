package Ficheros;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero03 {
    public static void main(String[] args) {
        
        try {BufferedWriter bwFrutas = new BufferedWriter(new FileWriter(".//Repositorio//Ficheros//Ficheros//Frutas.txt"));

            bwFrutas.write("Fresa\n");
            bwFrutas.write("Naranja\n");
            bwFrutas.write("Platano\n");
            bwFrutas.write("Platano beyaco\n");

            bwFrutas.close();

            System.out.println("Las frutas fueron agregadas correctamente a la lista");

        // Mostrar errores
        // Error (no se encontro el fichero)    
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero.");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero.");
        } 
    }
}
