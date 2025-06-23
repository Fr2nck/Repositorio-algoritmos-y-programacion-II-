package Diccionarios;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        // Inicializamos el HashMap
        HashMap<Integer,String> miDiccionario= new HashMap<Integer,String>();

        // Agregamos elementos al HashMap
        miDiccionario.put(0,"Gonzalo");
        miDiccionario.put(1, "Miguel");
        miDiccionario.put(2, "Rafael");
        miDiccionario.put(3, "Donatelo");
        miDiccionario.put(4, "Jhon");

        // Mostramos todas las Keys y valores del HashMap
        System.out.println("Mi disccionario es: " + miDiccionario);

        // Mostramos todos los valores
        //System.out.println("Los valores de mi disccionario son: " + miDiccionario.values());

        System.out.println("Entradas del diccionario: ");
        for(Map.Entry pareja: miDiccionario.entrySet() ){
            System.out.println(pareja.getValue());
        }

        // Comprovar si existe una clave
        System.out.print("Introduzca un codigo (Clave): ");
        
        int codigoIngresado = Integer.parseInt(System.console().readLine()); 

        if (miDiccionario.containsKey(codigoIngresado)) {
            System.out.print("El codigo: "+ codigoIngresado + " corresponde a: " );
            System.out.print(miDiccionario.get(codigoIngresado));
        } else {
            System.out.println("El docigo ingresado no existe. Boludo!!!!!");
        }
    }
}