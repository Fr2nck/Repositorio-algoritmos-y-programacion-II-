package Ficheros.PracticaFicherosCorrejidos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(".//Repositorio//Ficheros//PracticaFicherosCorrejidos//FicherosPracticaCorrejidos//Primos.dat"));

            String linea = "";
            while (linea != null) { 
                System.out.print(linea + "\n");
                linea = br.readLine();
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            System.out.println("Se ha producido un error:");
            System.out.println(e.getMessage());
        }
    }
}