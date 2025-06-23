package Ficheros.PracticaFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio05 {
    /*Pregunta 5 Realiza un programa que diga cuántas ocurrencias de una palabra hay 
    en un fichero. Tanto el nombre del fichero como la palabra se deben pasar como 
    argumentos en la línea de comandos.*/
    public static void main(String[] args) {
        try {
            BufferedReader brPalabras = new BufferedReader(new FileReader(".//Repositorio//Ficheros//PracticaFicheros//FicherosPractica//Leyenda.txt"));
            
            // String palabra = System.console().readLine("Ingresa la palabra que quieres buscar: ");

            String linea = "";
            
            System.out.println("El fichero Leyenda.txt contiene: ");
            while (linea != null) {
                System.out.println(linea);
                linea = brPalabras.readLine();
            }
            brPalabras.close();



        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero.");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero.");
        }
    }
}
