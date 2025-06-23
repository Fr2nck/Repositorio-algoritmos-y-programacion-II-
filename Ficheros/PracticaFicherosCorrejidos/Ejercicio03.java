package Ficheros.PracticaFicherosCorrejidos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 {
    public static void main(String[] args) {
        try {
            BufferedReader brColombia = new BufferedReader(new FileReader(".//Repositorio//Ficheros//PracticaFicherosCorrejidos//FicherosPracticaCorrejidos//Colombia.txt"));
            BufferedReader brPeru = new BufferedReader(new FileReader(".//Repositorio//Ficheros//PracticaFicherosCorrejidos//FicherosPracticaCorrejidos//Peru.txt"));
            BufferedWriter bwAmericaLatina = new BufferedWriter(new FileWriter(".//Repositorio//Ficheros//PracticaFicherosCorrejidos//FicherosPracticaCorrejidos//AmericaLatina.txt"));

            String linea1 = "";
            String linea2 = "";

            while ((linea1 != null) || (linea2 != null)) {
                linea1 = brColombia.readLine();
                linea2 = brPeru.readLine();

                if (linea1 != null) {
                    bwAmericaLatina.write(linea1 + "\n");
                }

                if (linea2 != null) {
                    bwAmericaLatina.write(linea2 + "\n");
                }
            }

            brColombia.close();
            brPeru.close();
            bwAmericaLatina.close();

        } catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}
