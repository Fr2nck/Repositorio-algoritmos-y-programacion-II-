package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero04 {
    public static void main(String[] args) {
        try{
        BufferedReader brAbancay = new BufferedReader(new FileReader(".//Repositorio//Ficheros//Ficheros//Abancay.txt")) ;
        BufferedReader brAndahuaylas = new BufferedReader(new FileReader(".//Repositorio//Ficheros//Ficheros//Andahuaylas.txt")) ;
        BufferedWriter bwApurimac = new BufferedWriter(new FileWriter(".//Repositorio//Ficheros//Ficheros//Apurimac.txt"));
        
        String linea01 = "";
        String linea02 = "";

        /* 
        // Estructura repetitiva para leer las lineas del archibo
        while (linea01 != null) {
            linea01 = brAbancay.readLine();            
        bwApurimac.write(linea01);
        }

        while (linea02 != null) {
            linea02 = brAndahuaylas.readLine();
        }
        */

        while (linea01 != null) {

            linea01 = brAbancay.readLine();
            if(linea01 != null){
                bwApurimac.write(linea01 + "\n");
            }

        }
        bwApurimac.write("\n");

        while (linea02 != null) {

            linea02 = brAndahuaylas.readLine();
            if(linea02 != null){
                bwApurimac.write(linea02 + "\n");
            }
        }
        
        brAbancay.close();
        brAndahuaylas.close();
        bwApurimac.close();
        System.out.println("Archibo Apurimac.txt creado satisfactoriamente");
        
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
