package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero01 {
    public static void main(String[] args) {

        System.out.println("¿Que archibo quieres mostrar?");
        System.out.println("Abancay, Andahuaylas o Cuzco");
        String ciudad = System.console().readLine();

        try {

            // (BufferedReader)almacena la informacion (caracter por caracter) en tiempo real
            BufferedReader brAbancay =new BufferedReader(new FileReader(".//Repositorio//Ficheros//Ficheros//" + ciudad + ".txt"));
            String linea = "";

            // Estructura repetitiva para leer las lineas del archibo
            while (linea != null) {
                System.out.println(linea);
                linea = brAbancay.readLine();
            }
            
            // Cerrar la estructura repetitiva
            brAbancay.close();    

        // Mostrar errores
        // Error (no se encontro el fichero)
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero " + ciudad + ".txt");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero " + ciudad + ".txt");
        }
    }
}