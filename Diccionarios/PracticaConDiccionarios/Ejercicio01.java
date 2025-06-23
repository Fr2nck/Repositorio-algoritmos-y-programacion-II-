package Diccionarios.PracticaConDiccionarios;

import java.util.HashMap;

public class Ejercicio01 {
    /*Ejercicio 1 Implementa el control de acceso al área restringida de un programa. 
    Se debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los 
    datos correctamente, el programa dirá “Ha accedido al área restringida”. 
    El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades 
    el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres 
    de usuario con sus correspondientes contraseñas deben estar almacenados en una 
    estructura de la clase HashMap.*/
    public static void main(String[] args) {
        
        // Crear un HashMap con nombres de usuario y contraseñas
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("usuario01", "1234");
        usuarios.put("usuario02", "4321");

        int intentosMax = 3;
        boolean accesoConcedido = false;

        for (int intentos = 0; intentos < intentosMax; intentos++) {

        // Solicitar nombre de usuario y contraseña
            System.out.println("Ingrese su nombre de usuario");
            String nombreUsuario = System.console().readLine();

            System.out.println("Ingrese su contraseña");
            int contraseña = Integer.parseInt(System.console().readLine());

        // Verificamos si el usuario y la contraseña son correctos
        System.out.println();
        if (usuarios.containsKey(nombreUsuario) && usuarios.get(nombreUsuario).equals(String.valueOf(contraseña))) {
            System.out.println("Ha accedido al área restringida.");
            accesoConcedido = true;
            break;
        } else {
            System.out.println("El nombre de usuario o contraeña son incorrectos, intentelo denuevo");
        }
        }
        // Mostramos el mensaje si no ingresa en los 3 intentos
        System.out.println();
        if (!accesoConcedido) {
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }
    }    
}