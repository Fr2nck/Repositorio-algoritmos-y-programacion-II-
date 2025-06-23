package Arrays.Arrayuni.PracticaArraysUnidimencionales02;
public class FranckMarquez_ActividadesArray02 {
    /*Ejercicio 2 Escribe un programa que genere 20 números enteros aleatorios 
    entre 0 y 100 y que los almacene en un array. El programa debe ser capaz de pasar
    todos los números pares a las primeras posiciones del array (del 0 en adelante)
    y todos los números impares a las celdas restantes.
    Utiliza arrays auxiliares si es necesario.*/
    public static void main(String[] args) {
        int[] numeros = new int[20];
        //Ingresar numeros del (0 al 100) de forma automatica
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }
        //Imprimir los valores del arreglo generado
        System.out.println("Los valores generados del arreglo son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]" + " ");
        }
        //Arreglos y contadores auxiliares
        int[] numerospares = new int[numeros.length];
        int[] numerosimpares = new int[numeros.length];
        int indexpares = 0 ;
        int indeximpares = 0;
        //Estructura para ingresar los valores pares e impares en arreglos auxiliares
        for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 ==0) {
                    numerospares[indexpares++] = numeros[i];
                } else {
                    numerosimpares[indeximpares++] = numeros[i];
                }
        }
        //arreglo y contador auxiliar final
        int[] numerosordenados = new int[numeros.length];
        int indexnumerosordenados = 0;
        //agregar los valores al arreglo final
        for (int i = 0; i < indexpares; i++) {
            numerosordenados[indexnumerosordenados++] = numerospares[i];
        }
        for (int i = 0; i < indeximpares; i++) {
            numerosordenados [indexnumerosordenados++] = numerosimpares[i];
        }
        //Estructura para imprimir los valores del arreglo ordenado
        System.out.println("");
        System.out.println("El arreglo ordenado tiene los siguiente elementos:");
        for (int i = 0; i < numerosordenados.length; i++) {
            System.out.print("[" + numerosordenados[i] + "]" + " ");
        }
    }
}
