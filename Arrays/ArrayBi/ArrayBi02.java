package Arrays.ArrayBi;
public class ArrayBi02 {
    /*Ejercicio 1 Define un array de números enteros de 3 filas por 6 columnas
    con nombre num y asigna los valores según la siguiente tabla. Muestra el contenido
    de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura. */
    public static void main(String[] args) {
        //Declaramos un arreglo de 3 filas por 6 columnas
        int[][] numeros = new int[3][6];
        numeros[0][0] = 0;
        numeros[0][1] = 30;
        numeros[0][2] = 2;
        numeros[0][5] = 5;
        numeros[1][0] = 75;
        numeros[1][4] = 0;
        numeros[2][2] = -2;
        numeros[2][3] = 3;
        numeros[2][5] = 11;
        int fila,columna;
        //Imprimir el señalizador de columnas
        System.out.print("        ");
        for (columna = 0; columna < 6; columna++) {
            System.out.print("   Columna " + columna);
        }
        System.out.println();
        //Imprimir el señañizacor de filas
        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila: " + fila + "|");
            for (columna = 0; columna < 6; columna++) {
                System.out.printf("%10d", numeros[fila][columna]);
            }    
            System.out.println();        
        }
    }
}
