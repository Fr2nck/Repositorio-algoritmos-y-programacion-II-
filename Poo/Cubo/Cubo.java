package Poo.Cubo;
public class Cubo {
    //Atributos
    int capacidad, contenido;
    //Capacidad = Litros maximos que caben en el cubo, Contenido = Litros actuales del cubo
    //Metodos
        //Constructor
    Cubo(int cap){
        this.capacidad = cap;
    }
        //Getter
    public int getcapacidad(){
        return this.capacidad;
    }
    public int getcontenido(){
        return this.contenido;
    }
        //Setter
    public void setcapacidad(int litros){
        this.capacidad = litros;
    }
    public void setcontenido(int litros){
        this.contenido = litros;
    }
        //Otros metodos
    public void vacia(){
        this.contenido = 0;
    }
    public void lleno(){
        this.contenido = capacidad;
    }
    // Pinta cubo en la pantalla
    void pintaCubo() {
        for (int nivel = this.capacidad; nivel > 0; nivel--) {
            if (this.contenido >= nivel) {
                System.out.println("#~~~~#");
            } else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }
    // Volcar el contenido de un cubo sobre otro
    void vuelvaEn(Cubo destino) {
        int libres = destino.getcapacidad() - destino.getcontenido();

        if (libres > 0) {
            if (this.contenido <= libres) {
                destino.setcontenido(destino.getcontenido() + this.contenido);
                this.vacia();
            } else {
                this.contenido -= libres; // this.contenido = this.contenido - libres;
                destino.lleno();
            }
        }
    }
}
