package ArrayList.PracticaArrayList;
/*Ejercicio 5 Realiza de nuevo el ejercicio de la colección de discos pero utilizando 
esta vez una lista para almacenar la información sobre los discos en lugar de un array 
convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto ocupa el programa 
original hecho con un array? ¿Cuánto ocupa este nuevo programa hecho con una lista?*/
public class Ejercicio05 {
    public static void main(String[] args) {
        
        Disco Disco01 = new Disco("Appetite For Destruction", "Guns N Roses", "Rock", 53);
    // Mostrar la información del disco
        System.out.println("El Disco primer dico tiene las siguientes caracteristicas: ");
        System.out.println("Título: " + Disco01.getTitulo());
        System.out.println("Autor: " + Disco01.getAutor());
        System.out.println("Género: " + Disco01.getGenero());
        System.out.println("Duración: " + Disco01.getDuracion() + " minutos");
     }
}      

class  Disco {
    private String titulo;
    private String autor;
    private String genero;
    private Integer duracion;

    // Constructor
    public Disco(String t, String a, String g,Integer d) {
        this.titulo = t;
        this.autor = a;
        this.genero = g;
        this.duracion =d;
    }

    // Getters
    public String getTitulo() {
        return this.titulo;
    }


    public String getAutor() {
        return this.autor;
    }

    public String getGenero() {
        return this.genero;
    }
    public Integer getDuracion(){
        return this.duracion;
    }
}