package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero09 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Calcula promedio de fichero");
            System.exit(-1);
        }
        try {
            BufferedReader brNumeros = new BufferedReader(new FileReader(args[0]));
            
            String linea = "0";
            int i = 0;
            double suma = 0 ;
            
            while (linea != null) {
                i++;
                suma = suma + Double.parseDouble(linea);
                linea = brNumeros.readLine();
            }
            i--;
            brNumeros.close();

            System.out.println("El primedio es: " + suma/i);

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro el fichero.");
        }

        // Error (no se pudo leer el fichero)
        catch(IOException ioe){
            System.out.println("No se puede leer el fichero.");
        }  
    }
}
