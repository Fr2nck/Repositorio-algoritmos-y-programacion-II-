package Ficheros.PracticaFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
    /*Pregunta 4 Realiza un programa que sea capaz de ordenar alfabéticamente las 
    palabras contenidas en un fichero de texto. El nombre del fichero resultado 
    debe ser el mismo que el original añadiendo un guion sort, por ejemplo 
    palabras_sort.txt. Suponemos que cada palabra ocupa una línea.*/
    public static void main(String[] args) {
        try {
            BufferedReader brPalabras = new BufferedReader(new FileReader(".//Repositorio//Ficheros//PracticaFicheros//FicherosPractica//Palabras.txt"));
            BufferedWriter bwPalabrasSort = new BufferedWriter(new FileWriter(".//Repositorio//Ficheros//PracticaFicheros//FicherosPractica//Palabras_Sort.txt"));
            
            String linea = "";

            ArrayList<String> ListPalabras = new ArrayList<String>();

            while (linea != null) {
                ListPalabras.add(linea);
                linea = brPalabras.readLine();
            }
            brPalabras.close();

            ListPalabras.remove(0);

            Collections.sort(ListPalabras);

            for(String s:ListPalabras){
                bwPalabrasSort.write(s + "\n");
            }
            bwPalabrasSort.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero.");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero.");
        }  
    }
}
