import java.util.HashMap;

public class Pregunta04 {
    /*Desarrolla un programa en Java que funcione como un buscador de sinónimos. 
    Para ello, utiliza un diccionario de correspondencias entre palabras en español 
    y su equivalente en inglés.
    Lista de nombre y sus sinomino:
    Caliente-Hot
    Rojo-Red
    Ardiente-Hot
    Verde-Green
    Agujetas-Stiff
    Abrasador-Hot
    Hierro-Iron
    Grande-Big
    El programa deberá solicitar al usuario una palabra en español y devolver una lista de sinónimos,
    es decir, otras palabras en español que compartan el mismo significado en inglés.
        Por ejemplo, si el usuario introduce "caliente", el programa debe devolver:
        Sinónimos: ardiente, candente, abrasador
    El programa determinará los sinónimos buscando en el diccionario las palabras en español 
    que tengan el mismo significado en inglés.
    Si la palabra ingresada existe en el diccionario pero no tiene sinónimos registrados, 
    se debe mostrar el mensaje:
        No conozco sinónimos de esa palabra.
    Si la palabra no se encuentra en el diccionario, se mostrará:
        No conozco esa palabra.
    El usuario podrá salir del programa escribiendo "salir".
        Ejemplo:
        Introduzca una palabra y le daré los sinónimos: caliente
        Sinónimos de caliente: ardiente, abrasador
        Introduzca una palabra y le daré los sinónimos: rojo
        No conozco sinónimos de esa palabra
        Introduzca una palabra y le daré los sinónimos: blanco
        No conozco esa palabra
        Introduzca una palabra y le daré los sinónimos: grande
        No conozco sinónimos de esa palabra
        Introduzca una palabra y le daré los sinónimos: salir*/
    public static void main(String[] args) {

        // Creamos un hashMap
        HashMap<String,String> dicSinoni = new HashMap<String,String>();

        // Agregamos valores al diccionario
        dicSinoni.put("caliente", "hot");
        dicSinoni.put("rojo", "red");
        dicSinoni.put("ardiente", "hot");
        dicSinoni.put("verde", "green");
        dicSinoni.put("agujetas", "stiff");
        dicSinoni.put("abrasador", "hot");
        dicSinoni.put("hierro", "iron");
        dicSinoni.put("grande", "big");

        // Bucle infinito hasta que se ingrese la palabra fin
        while (true) {
            // Pedimos la palabra que se quiera buscar
            System.out.print("Ingresa la palabra de la cual quieras los sinonimos: ");
            String palabra = System.console().readLine();
            if (palabra.equalsIgnoreCase("salir")) {
                break;
            }

            String sinonimo  = dicSinoni.get(palabra);
            System.out.println("El valor de sinonimo es: " + sinonimo );

            // Mostramos la palabra con sus respectivos sinonimos
            if (dicSinoni.containsKey(palabra)) {
                System.out.println("Los sinonimos de la palabra, " + palabra + " son: " + dicSinoni.get(sinonimo));
            } else {
                System.out.println("No conozco los sinonimos de: " + palabra);
            }
        }
    }
}
