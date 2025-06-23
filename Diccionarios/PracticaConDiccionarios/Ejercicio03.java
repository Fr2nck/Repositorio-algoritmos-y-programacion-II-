package Diccionarios.PracticaConDiccionarios;

import java.util.HashMap;

public class Ejercicio03 {
    /*Ejercicio 3 Crea un mini-diccionario español-inglés que contenga, al menos, 
    20 palabras (con su correspondiente traducción). Utiliza un objeto de la clase 
    HashMap para almacenar las parejas de palabras. El programa pedirá una palabra 
    en español y dará la correspondiente traducción en inglés.*/
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

        // Pedimos la palabra que se quiera traducir
        System.out.println("Ingrese una palabra en español que quiera traducir");
        String palabra = System.console().readLine();
        // Mostramos la palabra con su respectiva traduccion
        if (dicIngEsp.containsKey(palabra)) {
            System.out.println("La palabra, " + palabra + " se traduce como: " + dicIngEsp.get(palabra));
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }        
    }
}
