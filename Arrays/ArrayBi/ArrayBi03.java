package Arrays.ArrayBi;
public class ArrayBi03 {
    /*Ejercicio 2 Escribe un programa que pida 20 números enteros. Estos números se deben
    introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas 
    parciales de filas y columnas igual que si de una hoja de cálculo se tratara. 
    La suma total debe aparecer en la esquina inferior derecha. */
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        int fila, columna;
        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                System.out.print("Ingresa un valor para la posicion " +fila+","+columna + ": ");
                numeros[fila][columna] = Integer.parseInt(System.console().readLine()) ;
            }
        }
        System.out.println();
        //Inicializacion de un arreglo auxiliar
        int sumafila;
        for (fila = 0; fila < 4; fila++) {
            sumafila = 0; 
            for (columna = 0; columna < 5; columna++) {
                System.err.printf("%7d",numeros[fila][columna]);
                sumafila = sumafila + numeros[fila][columna];                
            }
            System.out.printf("|%7d\n", sumafila);
        }     
        //Inicializacion de un arreglo auxiliar
        System.out.println("------------------------------------");
        int sumacolumna;
        int sumatotal = 0;
        for (columna = 0; columna < 5; columna++) {
            sumacolumna = 0; 
            for (fila = 0; fila < 4; fila++) {
                sumacolumna = sumacolumna + numeros[fila][columna];
                sumatotal = sumatotal + sumacolumna;                 
            }
            System.out.printf("%7d", sumacolumna);
        }
        System.out.printf("|%7d\n", sumatotal);   
    }
}