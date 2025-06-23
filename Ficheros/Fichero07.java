package Ficheros;

public class Fichero07 {
    //Ingresar argumentos mediante CMD
    public static void main(String[] args) {

        System.out.println("Los argumentos ingresados son: ");
        
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);    
        }
    }
}