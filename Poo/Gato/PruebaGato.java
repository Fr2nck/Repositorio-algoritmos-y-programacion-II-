package Poo.Gato;
public class PruebaGato {
    public static void main(String[] args) {
        Gato silvestre = new Gato("","negro y blanco", "chusco", "macho", 15, 28.5);
        //Gato gardfield = new Gato("anaranjado", "empachado y chusco", "macho", 12, 50.0);
        Gato kyty = new Gato("","rosado", "peli corta", "hembra", 15, 30.0);

        //Hacer que el gato maulle
        System.out.println("Hola Gatito");
        silvestre.maullar();
        //Dar de comer al gato
        System.out.println("Toma tu comida gatito");
        silvestre.come("pescado");
        //Hacer que los gatos se conoscan
        System.out.println("Gatito te presento a tu amiguito");
        silvestre.peleaCon(kyty);

    }
}
