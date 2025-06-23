package Arrays.Arrayuni.PracticaArraysUnidimencionales01;
public class Ejercicio04 {
    /*Ejercicio 4: Realiza un programa que pida la temperatura media que ha hecho en 
    cada mes de un determinado año y que muestre a continuación un diagrama de barras
    horizontales con esos datos. Las barras del diagrama se pueden dibujar a base de 
    asteriscos o cualquier otro carácter. */
public static void main(String[] args) {
    int[] temperatura = new int[12];
    for (int i = 0; i < temperatura.length; i++) {
        System.out.println("Ingresa la temperatura media del mes: " + i);
        temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < temperatura.length; i++) {
        System.out.println(" ");
        System.out.println("La temperatura del mes " + i + " Es de: " + temperatura[i] + " Grados");
        for (int j = 0; j < temperatura[i]; j++) {
            if (j<temperatura[i]) {
                System.out.print("*");
            };
        };
    }
    /*System.out.println("Los valores ingresados al arreglo son:");
    for (int i = 0; i < temperatura.length; i++) {
        System.out.println("El mes " + i + " Tiene una temperatura de: " + "[" + temperatura[i] + "]" + " Grados");
    }*/
}
}