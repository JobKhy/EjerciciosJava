/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morse;

/**
 *
 * @author Job_M
 */
import java.util.Scanner;
public class main {
    
    static String morse[] = {
	".-",
	"-...",
	"-.-.",
	"-..",
	".",
	"..-.",
	"--.",
	"....",
	"..",
	".---",
	"-.-",
	".-..",
	"--",
	"-.",
	"---",
	".--.",
	"--.-",
	".-.",
	"...",
	"-",
	"..-",
	"...-",
	".--",
	"-..-",
	"-.--",
	"--.."
    };
    
    static String palabraActual="         ";
    static int palabrasEncontradas;
        
    
    public static void combinaciones(String palActual, int nIntentos, String mensaje, int nMensaje){
        
        if(nIntentos==0 && nMensaje==0){
            System.out.println(palabraActual+" ");
            palabrasEncontradas++;
        }
        for (int i = 0; i < morse.length; i++) {
            if(morse[i].equals(mensaje.substring(0,morse[i].length()))){
                System.out.println(i);
                Character temp = (char)('a'+i);
                palActual = temp.toString().concat(palActual.substring(1));
                combinaciones(palActual.substring(1), nIntentos-1, mensaje.substring(morse[i].length()), nMensaje-morse[i].length());
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String frase="", fraseMorse="";
        int num=0;
        boolean flagggg=true;
        
        System.out.println("Introduce la frase (1 a 10 letras)");
        do{
            frase = kb.nextLine();
            if(frase.length()<1 || frase.length()>10){
                System.out.println("Introduzca una frase de entre 1 a 10 caracteres");
            }else{
                frase=frase.toLowerCase();
                char letra;
                for (int i = 0; i < frase.length(); i++) {
                    letra=frase.charAt(i);
                    flagggg=letra<'a' || letra>'z';
                };
                if(flagggg){
                    System.out.println("Introduzca caracteres de la A a la Z (Mayúsculas o minúsculas)");
                }else{
                    char []chars = frase.toCharArray();
                    for(int i =0;i<chars.length;i++){
                        fraseMorse+=morse[chars[i]-'a'];
                    }
                }
            }
        }while(frase.length()<1 || frase.length()>10 || flagggg);
        
        System.out.println("La frase en morse (sin espacios) es: "+fraseMorse+"\nCalculando combinaciones con los mismos caracteres...");
        palabrasEncontradas=0;
        combinaciones(palabraActual, frase.length(), fraseMorse, fraseMorse.length());
        
        System.out.println(palabrasEncontradas+" combinaciones");
        
    }
    
}