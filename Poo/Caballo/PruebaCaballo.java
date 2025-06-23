package Poo.Caballo;
public class PruebaCaballo {
    public static void main(String[] args) {
        Caballo caballo01 = new Caballo("Triton", "Negro", "Shire", "Macho", 15, 420);
        Caballo caballo02 = new Caballo("Rayo", "blanco", "Pura sangre", "Macho",8,410);

        //Hacer que el caballo relinche
        System.out.println("*Saludas al caballo*");
        caballo01.relinchar();
        //Hacer que el caballo cabalgue
        System.out.println("*Liberas al caballo*");
        caballo01.cabalga();
        //Hacer que el caballo rumee
        System.out.println("*Ofreces comida al caballo*");
        caballo01.rumia();
        //Presentar a tus caballos
        System.out.println("Hola amiguitos este es mi caballo y se llama: " + caballo01.getnombre() +" y tiene " + caballo01.getedad() + " años");
        System.out.println("Hola amiguitos este es mi caballo y se llama: " + caballo02.nombre);
    }
}
