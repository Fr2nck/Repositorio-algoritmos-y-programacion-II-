package Funciones;

import Funciones.Librerias.Basicas;

public class Funciones02 {
    public static void main(String[] args) {
        System.out.print("Ingresa el primero numero: ");
        int n1 = Integer.parseInt(System.console().readLine());
        System.out.print("Ingresa el segundo numero: ");
        int n2 = Integer.parseInt(System.console().readLine());
        //Imprimir las operaciones llamando a las funciones
        System.out.println("La suma es: " + Basicas.misuma(n1, n2));
        System.out.println("La resta es: " + Basicas.miresta(n1, n2));
        System.out.println("La multiplicaciòn es: " + Basicas.mimultiplicacion(n1, n2));
        System.out.println("La diviciòn es: " + Basicas.midivicion(0, 0));
    }
}
