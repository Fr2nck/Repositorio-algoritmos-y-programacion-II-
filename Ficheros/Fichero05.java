package Ficheros;

import java.io.File;

public class Fichero05 {
    public static void main(String[] args) {
        File f = new File(".");
        
        String[] listaArchibos = f.list();
        for(String nombreArchivo: listaArchibos){
            System.out.println(nombreArchivo);
        }
    }
}