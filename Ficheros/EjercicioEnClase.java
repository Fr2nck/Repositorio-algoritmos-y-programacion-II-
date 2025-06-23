package Ficheros;
/*1.Escribir un método, que dado un objeto de la clase String cuente diferentes tipos de caracteres.
  En particular, el método deberá imprimir el número de letras, dígitos y espacios en blanco de la cadena.
  Intenta hacer un programa que escriba el conteo (por ejemplo) de la cadena. "Yo soy un Saiyajin criado 
  en la Tierra. Por todos los guerreros Saiyajin que asesinaste.. . Y también, por todos los Namekusei 
  que mataste... ¡Juro que te exterminaré!" .*/
public class EjercicioEnClase {
    public static void main(String[] args) {
        String frase = "Yo soy un Saiyajin criado en la Tierra. Por todos los guerreros Saiyajin que asesinaste.. . Y también, por todos los Namekusei que mataste... ¡Juro que te exterminaré!";
        
        String espacio = " ";
        String digitos = "0123456789";
        int contadorEspacios = 0;
        int contadorDigitos = 0;
        int contadorCaracter = 0;
        

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == espacio.charAt(0)) {
                contadorEspacios++;
            }else if(frase.charAt(i) == digitos.charAt(0)|| frase.charAt(i) == digitos.charAt(1)|frase.charAt(i) == digitos.charAt(2)||frase.charAt(i) == digitos.charAt(3)||frase.charAt(i) == digitos.charAt(4)||frase.charAt(i) == digitos.charAt(5)||frase.charAt(i) == digitos.charAt(6)||frase.charAt(i) == digitos.charAt(7)||frase.charAt(i) == digitos.charAt(8)||frase.charAt(i) == digitos.charAt(9)){

            }
            else{                
                contadorCaracter++;
            }
        }
        System.out.println("El numero de espacios en la frase es: " + contadorEspacios);
        System.out.println("El numero de digitos en una frase es: " + contadorDigitos);
        System.out.println("El numero de letras de la frase es: " + contadorCaracter);
    }
}
