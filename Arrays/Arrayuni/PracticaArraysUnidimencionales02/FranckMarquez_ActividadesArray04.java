package Arrays.Arrayuni.PracticaArraysUnidimencionales02;
public class FranckMarquez_ActividadesArray04 {
    /*Ejercicio 4 Realiza un programa que pida 10 números por teclado y
    que los almacene en un array. A continuación, se mostrará el contenido
    de ese array junto al índice (0 – 9). Seguidamente el programa pedirá
    dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar
    que inicial es menor que final y que ambos números están entre 0 y 9. 
    El programa deberá colocar el número de la posición inicial en la posición
    final, rotando el resto de números para que no se pierda ninguno. Al final 
    se debe mostrar el array resultante.*/
    public static void main(String[] args) {
        int[] numeros = new int [10];
        //pedir ingresar 10 numeros enteros
        System.out.println("Ingrese 10 numeros enteros para el arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero para la posición " + i + ":");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        //Imprimir el array en estructura de tabla
        System.out.println("El array contiene los siguientes valores");
        System.out.println("Indice " + "Número");  
        for (int i = 0; i < numeros.length; i++) {
            System.out.print( i + "      ");
            System.out.println(numeros[i]);
        }
        //Pedir Ingresar dos numeros entre el 0 y 9
        System.out.println("Ingresa la posicion que quieres cambiar: ");
        int Inicio =Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa a que posicion quieres que se cambie: ");
        int Final =Integer.parseInt(System.console().readLine());
        //Arreglo auxiliar
        int[] aux = new int[1] ;
        //Guardar el valor que sera cambiado
        aux[0] = numeros[Inicio];
        //pasar los valores antes del Inicio una posicion a la derecha
        for (int i = Inicio; i > 0; i--) {
            numeros[i] = numeros[i-1];
        }
        //Enviar el ultimo valor al inicio
        numeros[0] = numeros[numeros.length-1];
        //Pasar los valores despues del final una posicion a la derecha
        for (int i = numeros.length-1; i > Final; i--) {
            numeros[i] =numeros[i-1];
        }
        //Ingresar el valor guardado
        numeros[Final] = aux[0];

        System.out.println(" ");
        System.out.println("Los valores reordenados del arreglo son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]" + " ");
        }
    }
}