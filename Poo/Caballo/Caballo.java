package Poo.Caballo;
public class Caballo {
    //Atributos
    String nombre,color,raza,sexo;
    int edad,carrerasGanadas;
    double peso;
    //Metodos
        //Constructor
    Caballo(String n,String c,String r,String s,int e,double p){
        this.nombre =n;
        this.color = c;
        this.raza = r;
        this.sexo = s;
        this.edad = e;
        this.peso = p;
    }
        //Getter
    public String getnombre(){
        return this.nombre;
    }
    public String getcolor(){
        return this.color;
    }
    public String getraza(){
        return this.raza;
    }
    public String getsexo(){
        return this.sexo;
    }
    public int getedad(){
        return this.edad;
    }
    public double getpeso(){
        return this.peso;
    }    
        //Hacer que el caballo relinche
    public void relinchar(){
        System.out.println("Hiiiiieeeee");
    }
        //Hacer que el caballo cabalgue
    public void cabalga(){
        System.out.println("tocotoc, tocotoc, tocotoc");
    }
        //Hacer que el caballo rumee
    public void rumia(){
        System.out.println("ñan, ñan, ñan");
    }
}