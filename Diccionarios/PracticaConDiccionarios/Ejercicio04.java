package Diccionarios.PracticaConDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Ejercicio04 {
    /*Ejercicio 4 Realiza un programa que escoja al azar 5 palabras en español del 
    mini diccionario del ejercicio anterior. El programa irá pidiendo que el usuario 
    teclee la traducción al inglés de cada una de las palabras y comprobará si son 
    correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas 
    y cuántas erróneas.*/
    public static void main(String[] args) {
        // Creamos un hashMap
        HashMap<String,String> dicIngEsp = new HashMap<String,String>();

        // Agregamos valores al hashMap
        dicIngEsp.put("tiempo", "time");
        dicIngEsp.put("persona", "Person");
        dicIngEsp.put("año", "year");
        dicIngEsp.put("dia", "day");
        dicIngEsp.put("cosa", "thing");
        dicIngEsp.put("hombre", "man");
        dicIngEsp.put("mundo", "world");
        dicIngEsp.put("vida", "life");
        dicIngEsp.put("mano", "hand");
        dicIngEsp.put("parte", "part");
        dicIngEsp.put("niño", "child");
        dicIngEsp.put("ojo", "eye");
        dicIngEsp.put("mujer", "woman");
        dicIngEsp.put("lugar", "place");
        dicIngEsp.put("trabajo", "work");
        dicIngEsp.put("semana", "week");
        dicIngEsp.put("punto", "point");
        dicIngEsp.put("grande", "big");
        dicIngEsp.put("mucho", "much");
        dicIngEsp.put("ahora", "now");

        
        // Creamos una lista con las palabras en español
        ArrayList<String> palabrasEsp = new ArrayList<>(dicIngEsp.keySet());

        // Mezclamos las palabras
        Collections.shuffle(palabrasEsp, new Random());

        // Creamos 2 variables auxiliares para contar las respuestas
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        // Pedir al usuario que traduzca 5 palabras
        for (int i = 0; i < 5; i++) {
            String palabraEsp = palabrasEsp.get(i);
            String traduccionCorrecta = dicIngEsp.get(palabraEsp);

            System.out.println("¿Cuál es la traducción de " + palabraEsp + "?");
            String traduccionUsuario = System.console().readLine();

            // Comprobamos si la traduccion es correcta
            if (traduccionUsuario.equals(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto");
                respuestasIncorrectas++;
            }
        }

        // Mostrarmos el numero de respuestas correctas e incorrectas
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
