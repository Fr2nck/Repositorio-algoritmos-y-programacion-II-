package Examenes.ExamenParcial01;

import java.util.ArrayList;
import java.util.List;

/*Pregunta 1: Escribe un programa que, dado un par de coordenadas que corresponden 
a la posición de un alfil en un tablero de ajedrez, determine todas las casillas a 
las que puede mover dicho alfil. El alfil se mueve exclusivamente en las diagonales 
del tablero, como se muestra en la figura adjunta. El tablero tiene un total de 64 
casillas, donde las columnas están representadas por las letras de la "a" a la "h" 
y las filas están numeradas del 1 al 8.*/
public class Pregunta01 {
    public static void main(String[] args) {
        // Leer las coordenadas iniciales del alfil
        String posicionInicial = System.console().readLine("Ingrese la posición inicial del alfil (ejemplo: e4): ");

        // Llamar a la funcion que determina los posibles movimientos
        List<String> movimientos = calcularMovimientos(posicionInicial);

        // Imprimir resultados
        System.out.println("Movimientos posibles:");
        for (String movimiento : movimientos) {
            System.out.println(movimiento);
        }
    }

    // Método para calcular los movimientos posibles del alfil
    private static List<String> calcularMovimientos(String posicionInicial) {
        List<String> movimientos = new ArrayList<>();
        char columnaInicial = posicionInicial.charAt(0);
        int filaInicial = posicionInicial.charAt(1) - '0';

        // Direcciones diagonales
        int[] desplazamientosFila = {1, 1, -1, -1};
        int[] desplazamientosColumna = {1, -1, 1, -1};

        // Explorar cada dirección
        for (int i = 0; i < 4; i++) {
            int fila = filaInicial;
            char columna = columnaInicial;
            while (true) {
                fila += desplazamientosFila[i];
                columna += desplazamientosColumna[i];

                if (fila >= 1 && fila <= 8 && columna >= 'a' && columna <= 'h') {
                    movimientos.add(String.valueOf(columna) + fila);
                } else {
                    break;
                }
            }
        }
        return movimientos;
    }
}