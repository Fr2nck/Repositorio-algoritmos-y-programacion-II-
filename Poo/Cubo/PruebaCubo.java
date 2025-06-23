package Poo.Cubo;
public class PruebaCubo {
    public static void main(String[] args) {
        Cubo micubito = new Cubo(5);
        Cubo micubote = new Cubo(10);

        System.out.println("Cubito \n");
        micubito.pintaCubo();
        System.out.println("Cubote \n");
        micubote.pintaCubo();

        System.out.println("Llena Cubito \n");
        micubito.lleno();
        micubito.pintaCubo();

        System.out.println("Llena Cubote \n");
        micubote.lleno();
        micubote.pintaCubo();

        System.out.println("Vacia Cubote \n");
        micubote.vacia();
        micubote.pintaCubo();

        System.out.println("\nAhora vuelco el contenido de el cubito en el cubote\n");
        micubito.vuelvaEn(micubote);

        System.out.println("Cubito \n");
        micubito.pintaCubo();

        System.out.println("Cubote \n");
        micubote.pintaCubo();
    }
}
