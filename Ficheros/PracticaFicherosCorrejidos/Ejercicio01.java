package Ficheros.PracticaFicherosCorrejidos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 {
    /*Pregunta 1 Escribe un programa que guarde en un fichero con nombre primos.dat
     los números primos que hay entre 1 y 500.*/
    public static void main(String[] args) {
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(".//Repositorio//Ficheros//PracticaFicherosCorrejidos//FicherosPracticaCorrejidos//Primos.dat"));
            for (int i = 1; i < 501; i++) {
                if (esPrimo(i)) {
                    bw.write(String.valueOf(i) + "\n");
                }
            }
            bw.close();
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero.");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero.");
        
        }
    }
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
        // Verificamos divisibilidad desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }
        return true; // Si no es divisible por ningún número, es primo
    }
}
