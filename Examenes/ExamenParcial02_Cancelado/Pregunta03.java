package Examenes.ExamenParcial02_Cancelado;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pregunta03 {
    /* Escribe un programa capaz de quitar los comentarios de un programa de Java.
    Se utilizaría de la siguiente manera:
    quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
    Por ejemplo:
    quita_comentarios hola.java holav2.java
    crea un fichero con nombre holav2.java que contiene el código de hola.java 
    pero sin los comentarios. */
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Uso: quita_comentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Kumiho\\Desktop\\Universidad\\2024-02\\Algoritmos y programación 2\\Ficheros_Repositorios\\Repositorio\\Examenes\\ExamenParcial02_Cancelado\\Ficheros_ExamenParcial02_Cancelado\\HolaMundo.java"));
             PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Kumiho\\Desktop\\Universidad\\2024-02\\Algoritmos y programación 2\\Ficheros_Repositorios\\Repositorio\\Examenes\\ExamenParcial02_Cancelado\\Ficheros_ExamenParcial02_Cancelado\\HolaMundoV02.java"))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                // Si la línea no comienza con //, se copia al archivo limpio
                if (!linea.trim().startsWith("//")) {
                    pw.println(linea);
                }
            }            
            br.close();
            pw.close();
            System.out.println("Comentarios eliminados correctamente.");
             
        } catch (IOException e) {
            System.out.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}
