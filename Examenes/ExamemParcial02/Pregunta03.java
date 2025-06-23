import java.util.ArrayList;
import java.util.HashMap;

public class Pregunta03 {
    /*Un supermercado de productos ecológicos necesita un programa para gestionar 
    la venta de su mercancía. En esta primera versión, el programa debe permitir la compra 
    de los productos listados en la siguiente tabla junto con sus respectivos precios.
    El programa debe funcionar de la siguiente manera:
    El usuario introduce el nombre de un producto y el número de unidades que desea comprar.
    Ejemplo: Si quiere comprar tres botes de guisantes, ingresará "guisantes" y luego "3".
    La compra finaliza cuando el usuario introduce la palabra "fin", el programa pide un código de descuento
    Si el usuario introduce el código “DUDUCITO”, se aplica un 10% de descuento en la compra.
    Suponemos que el usuario solo comprará productos disponibles (no es necesario validar nombres incorrectos).
    Los productos y sus precios deben almacenarse en un diccionario.
    La lista de compras del usuario debe almacenarse en una o varias listas.
    Requisitos:
    Utilizar un diccionario para almacenar los productos y sus precios.
    Utilizar una o varias listas para registrar los productos comprados y sus cantidades.
    Implementar la lógica para calcular el total de la compra y mostrarlo al finalizar.
    Tabla de precios:
    Avena: 2.21
    Garbanzos: 2.39
    Tomate: 1.59
    Jengibre: 3.13
    Quinoa: 4.50
    Guisantes: 1.60*/
    public static void main(String[] args) {
        // Diccionario para almacenar productos y sus precios
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("avena", 2.21); 
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        // Listas para almacenar productos, cantidades y subtotales
        ArrayList<String> listaProductos = new ArrayList<>();
        ArrayList<Integer> listaCantidades = new ArrayList<>();
        ArrayList<Double> listaSubtotales = new ArrayList<>();

        // Introducir codigo de descuento
        System.out.print("Ingresa un codigo de descuento: ");
        String codDescuento = (System.console().readLine());

        // Bucle infinito hasta que se ingrese la palabra fin
        while (true) {
            System.out.print("Producto: "); 
            String producto = System.console().readLine();
            if (producto.equalsIgnoreCase("fin")) {
                break; 
            }
            System.out.print("Cantidad: "); 
            int cantidad = Integer.parseInt(System.console().readLine()); 
            // Verifica si el producto está disponible
            if (productos.containsKey(producto)) { 
                listaProductos.add(producto); 
                listaCantidades.add(cantidad); 
                double subtotal = productos.get(producto) * cantidad; 
                listaSubtotales.add(subtotal); 
            // Si no esta disponible
            } else {
                System.out.println("Producto no disponible");
            }
        }

        // Imprime la tabla con los detalles de la compra
        System.out.println("Producto    Precio   Cantidad   Subtotal");
        System.out.println("----------------------------------------");
        double total = 0;

        for (int i = 0; i < listaProductos.size(); i++) {
            String prod = listaProductos.get(i);
            double precio = productos.get(prod);
            int cantidad = listaCantidades.get(i); 
            double subtotal = listaSubtotales.get(i); 
            System.out.printf("%-10s %7.2f %10d %10.2f%n", prod, precio, cantidad, subtotal);
            total += subtotal;
        }
        System.out.println("----------------------------------------");
        // Imprimir el total con descuento si se introdujo el codigo de descuento correcto
        if (codDescuento.equalsIgnoreCase("DUDUCITO")) {
            System.out.printf("Total: %.2f%n", total-(total*0.1));
        } else {
            System.out.printf("Total: %.2f%n", total);
        }
    }
}
