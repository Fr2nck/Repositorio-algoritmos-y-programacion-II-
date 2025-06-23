package Funciones;
public class Funciones01 {
    public static void main(String[] args) {
        System.out.print("Ingrese un numero entero positivo: ");
        int n =Integer.parseInt(System.console().readLine());
        if (esPrimo(n)) {
            System.out.println("El numero: " + n + " Es primo");
        }else{
            System.out.println("El numero: " + n + " No es primo");
        }
    }
    public static boolean esPrimo(int x) {
        if (x <= 1) {
            return false;
        }else{
            for (int i = 2; i < x; i++) {
                if ((x % i) == 0){
                    return false;
                }
            }return true;
        }

    }
}
