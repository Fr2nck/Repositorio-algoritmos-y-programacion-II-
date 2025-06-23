package Diccionarios.PracticaConDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio02 {
    /*Ejercicio 2 Realiza un programa que escoja al azar 10 cartas de la baraja española 
    (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para 
    almacenarlas y asegúrate de que no se repite ninguna.*/
    public static void main(String[] args) {

        // Definir los palos de la baraja española
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        
        // Creamos un arrayList para almacenar las cartas
        ArrayList<Carta> baraja = new ArrayList<>();

        // Crear las cartas de la baraja
        for (int i = 0; i < palos.length; i++) {
            String palo = palos[i];
            for (int valor = 1; valor <= 10; valor++) { 
                baraja.add(new Carta(palo, valor));
            }       
        }

        // Mezclamos la baraja
        Collections.shuffle(baraja, new Random());

        // Creamos un nuevo arrayList para agregar las primeras 10 cartas de la baraja
        ArrayList<Carta> cartasSeleccionadas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cartasSeleccionadas.add(baraja.get(i));
        }

        // Mostrar las cartas seleccionadas
        System.out.println("Las 10 primeras cartas seleccionadas:");
        for (Carta carta : cartasSeleccionadas) {
            System.out.println(carta);
        }
    }    
}
// Creamos la clase carta
class Carta{
    String palo;
    int valor;

    // Constructor
    public Carta(String p,int v){
        this.palo = p;
        this.valor = v;
    }
    // Getter
    public String getpalo(){
        return palo;
    }
    public int getvalor(){
        return valor;
    }
    // Metodo para mostrar el valor de la carta y el palo
    public String toString() {
        return valor + " de " + palo;
    }
}