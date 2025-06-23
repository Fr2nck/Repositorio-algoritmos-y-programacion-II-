package Ficheros.PracticaFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
    /*Pregunta 2 Realiza un programa que lea el fichero creado en el ejercicio anterior 
    y que muestre los números por pantalla.*/
    public static void main(String[] args) {

        try {BufferedReader brNumPrimos = new BufferedReader(new FileReader(".//Repositorio//Ficheros//PracticaFicheros//FicherosPractica//Primos.dat"));
            String linea = "";

            while (linea != null) {
                System.out.println(linea);
                linea = brNumPrimos.readLine();
            }
            brNumPrimos.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero.");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero.");
        }
    }
}