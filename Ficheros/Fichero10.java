package Ficheros;
/*Procesamiento de archivos de texto
    Pasos a seguir:
    1.Leer linea a linea el archivo
    2.Modificar la linea(metodos de clase String)
    3.Grabar la linea modificada en el mismo archivo o en un distinto
    4.Volver al paso 1 
Metodos de la clase String:
    -charAt (in n): regresa el caracter establecido por el caracter n.
        =>gonzalo cartAt(3) = "z"

    -indexOf(String palabra): regresa el numero que indica la posicion en la que comienza esta palabra.
    
    -legth(): regresa la longitud que tiene una cadena de texto.

    -replace(char c1,char c2): regresa la misma cadena pero con una modificacion.
        =>gonzalo replace("o","a") = "ganzala"

    -substring(int inicio, int fin): regresa un sub cadena.
        =>gonzalo substring(3,6) = "zalo"

    -toLowerCase(): regresa una cadena  en minusculas

    -toUpperCase(): regresa una cadena en mayusculas

*/
public class Fichero10 {
    public static void main(String[] args) {

        System.out.println("\nEjemplo 1");
        System.out.println("En la posicion 2 de berenjena esta la letra: " + "berenjena".charAt(2));

        String frase = "Solo se que nada se";
        System.out.println("\nEjemplo 2");
        System.out.println("La secuencia *se* aparece en la frase en la posicion: " + frase.indexOf("se"));

        System.out.println("\nEjemplo 3");
        System.out.println("La frase: *" + frase + "* tiene una longitud de: " + frase.length() + " caracteres");

        System.out.println("\nEjemplo 4");        
        String frase2 = frase.replace("e", "i");
        System.out.println("La frase modificada es: " + frase2);

        System.out.println("\nEjemplo 5");
        System.out.println(frase.substring(12,19));
        
        System.out.println("\nEjemplo 6");
        System.out.println("Frase en minuscula: " + frase.toLowerCase());
        System.out.println("Frase en mayuscula: " + frase.toUpperCase());

        String frase3 = "";        
        for (int i = frase.length()-1; i >= 0 ; i--) {
            frase3 = frase3 + frase.charAt(i);
        }
        System.out.println("\nEjemplo 7");
        System.out.println("La frase invertida es: " + frase3);

    }
}
