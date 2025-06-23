package Examenes.ExamenParcial01;
/*Pregunta 2: Desarrolla un programa que calcule la estatura media, mínima y máxima 
en centímetros de personas de diferentes países. El array que contiene los nombres 
de los países es el siguiente: país = {“España”, “Rusia”, “Japón”, “Australia”}. 
Las estaturas deben simularse mediante una matriz de 4 filas y 10 columnas, con 
números aleatorios generados entre 140 y 210 (inclusive). Los decimales en el cálculo 
de la media pueden ser despreciados. El programa debe mostrar los nombres de los 
países utilizando el array proporcionado (no se deben escribir directamente en el código).
Además, debes calcular y mostrar la estatura media, mínima y máxima para cada país.*/
public class Pregunta02 {
    public static void main(String[] args) {
        // Array para almacenar estaturas
        int[][] estatura = new int[4][5];
        // Array para almacenar los paises
        String[] paises = {"España", "Rusia", "Japon", "Australia"};
        
        // Rellenar el array de estaturas con numeros aleatorios
        for (int i = 0; i < estatura.length; i++) {
            for (int j = 0; j < estatura[i].length; j++) {
                estatura[i][j] = 140 + (int) (Math.random() * 71);
            }
        }
        // Inicializamos las variables para fila y columna
        int fila, columna;
        // Imprimimos el encabezado
        System.out.printf("%-10s", "País");
        for (int i = 0; i < estatura[0].length; i++) {
            System.out.printf("%10s", " ");
        }
        System.out.printf("%10s%10s%10s%n", "Media", "Mínimo", "Máximo");

        //Imprimir el arreglo y calcular estadísticas
        for (fila = 0; fila < estatura.length; fila++) {
            System.out.printf("%-10s", paises[fila]);
            int suma = 0;
            int maximo = Integer.MIN_VALUE;
            int minimo = Integer.MAX_VALUE;
            for (columna = 0; columna < estatura[fila].length; columna++) {
                int valor = estatura[fila][columna];
                System.out.printf("%10d", valor);
                //Calculamos el máximo y mínimo
                suma += valor;
                if (valor > maximo) maximo = valor;
                if (valor < minimo) minimo = valor;
            }
            //Calculamos la media
            int media = suma / estatura[fila].length;
            // Mostrar estadísticas
            System.out.printf("%10d%10d%10d%n", media, minimo, maximo);
        }
    }
}
