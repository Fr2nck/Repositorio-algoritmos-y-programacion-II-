package Ficheros.PracticaFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 {
    /*Pregunta 3 Escribe un programa que guarde en un fichero el contenido de otros 
    dos ficheros, de tal forma que en el fichero resultante aparezcan las líneas de 
    los primeros dos ficheros mezcladas, es decir, la primera línea será del primer 
    fichero, la segunda será del segundo fichero, la tercera será la siguiente del 
    primer fichero, etc.*/
    public static void main(String[] args) {
        
        try { 
            BufferedReader brColombia = new BufferedReader(new FileReader(".//Repositorio//Ficheros//PracticaFicheros//FicherosPractica//Colombia.txt"));
            BufferedReader brPeru = new BufferedReader(new FileReader(".//Repositorio//Ficheros//PracticaFicheros//FicherosPractica//Peru.txt"));
            BufferedWriter bwAmericaLatina = new BufferedWriter(new FileWriter(".//Repositorio//Ficheros//PracticaFicheros//FicherosPractica//AmericaLatina.txt"));

            String linea01 = "";
            String linea02 = "";
            
            while (linea01 != null || linea02 != null) {

                while ((linea01 != null) || (linea02 != null)) {
                    linea01 = brColombia.readLine();
                    linea02 = brPeru.readLine();
                    if (linea01 != null) {
                        bwAmericaLatina.write(linea01 + "\n");
                    }
                    if (linea02 != null) {
                        bwAmericaLatina.write(linea02 + "\n");
                    }
                }
    
            }
            brColombia.close();
            brPeru.close();
            bwAmericaLatina.close();
            System.out.println("El archibo AmericaLatina.txt fue creado correctamente");

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero.");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero.");
        }        
    }
}
