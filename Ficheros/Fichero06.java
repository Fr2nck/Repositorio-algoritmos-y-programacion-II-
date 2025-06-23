package Ficheros;

import java.io.File;

    //Borrar un fichero
public class Fichero06 {
    public static void main(String[] args) {

        System.out.println("Ingresa el nombre del fichero a borrar: ");
        
        String archivo = System.console().readLine();

        File fichero = new File(archivo);

        if (fichero.exists()) {
            fichero.delete();
            System.out.println("El fichero " + archivo + " fue borrado correctamente.");
        } else {
            System.out.println("El fichero " + archivo + " no existe");
        }
    }
}
