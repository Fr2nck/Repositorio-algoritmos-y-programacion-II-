package Arrays.Arrayuni;
public class Array03 {
    public static void main(String[] args) {
        //Inicializar el arreglo de 10 elementos
        int[] numeros = new int[10];

        //Estructura repetitiva para pedir numeros de forma manual
        /*  for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el valor para la posicion: " + i);;
            numeros[i] = Integer.parseInt(System.console().readLine());
        }*/
        //Estructura repetitiva para ingresar numeros de forma automatica
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 21);
        }
        //Estructura repetitiva para imprimir los numeros
        System.out.println("El arreglo tiene los siguiente elementos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]" + " ");
        }
    }
}