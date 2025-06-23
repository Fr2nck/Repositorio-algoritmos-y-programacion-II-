package Examenes.ExamenParcial02_Cancelado;

import java.util.HashMap;
import java.util.Map;

public class Pregunta02 {
    /*Desarrolla un programa que sea capaz de identificar la capital de un país y, 
    además, aprender nuevas capitales.
    El programa debe funcionar de la siguiente manera:
    1. En un inicio, el programa solo conoce las capitales de 
    España, Portugal y Francia. Estos datos deben estar almacenados en un diccionario.
    2. El usuario puede preguntar por la capital de un país escribiendo su nombre.
        ○ Si el país está en el diccionario, el programa responderá con su capital.
        ○ Si el país no está en el diccionario, el programa deberá preguntar al usuario 
        cuál es su capital y almacenarla en el mismo diccionario para futuras consultas.
    3. El usuario puede salir del programa escribiendo la palabra "salir".
    Requisitos:
        ● Utilizar un diccionario para almacenar los países y sus capitales.
        ● Implementar la funcionalidad de aprendizaje para que el programa recuerde nuevas capitales agregadas por el usuario.
        ● Mantener un ciclo de consulta hasta que el usuario escriba "salir".
    Escribe el código necesario para resolver este problema.
    Ejemplo:
    Escribe el nombre de un pais y te dire su capital: España
    La capital de España es Madrid
    Escribe el nombre de un pais y te dire su capital: Alemania
    No conozco la respuesta¿cual es la capital de Alemania?: Berlin
    Gracias por enseñarme nuevas capitales
    Escribe el nombre de un pais y te dire su capital: Salir */
    public static void main(String[] args) {

        // Diccionario para almacenar países y sus capitales
        Map<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid"); 
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");

        // Bucle infinito hasta que se ingrese la palabra fin
        while (true) {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            String pais = System.console().readLine(); 
            if (pais.equalsIgnoreCase("salir")) {
                break;
            }
            
            if (capitales.containsKey(pais)) { // Si el país está en el diccionario
                System.out.println("La capital de " + pais + " es " + capitales.get(pais));

            } else { // Si el país no está en el diccionario
                System.out.print("No conozco la respuesta, ¿cuál es la capital de " + pais + "?: ");
                String capital = System.console().readLine();

                capitales.put(pais, capital); // Almacena la nueva capital en el diccionario
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }
        System.out.println("Programa terminado");
    }
}
