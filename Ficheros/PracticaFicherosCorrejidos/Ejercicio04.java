package Ficheros.PracticaFicherosCorrejidos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(".//Repositorio//Ficheros//PracticaFicherosCorrejidos//FicherosPracticaCorrejidos//Palabras.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(".//Repositorio//Ficheros//PracticaFicherosCorrejidos//FicherosPracticaCorrejidos//Palabras_Sort.txt"));

            ArrayList<String> a = new ArrayList<String>();

            String linea = "";
            while (linea != null) {
                a.add(linea);
                linea = br.readLine();
            }
            br.close();

            a.remove(0);
            Collections.sort(a);

            for (String s : a) {
                bw.write(s + "\n");
            }
            bw.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
