/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado;

/**
 *
 * @author Alumno
 */
public class cifrar {
    String textoCodificado="";
     public String codificar(String letras, String texto, int num){
         
         texto=texto.toUpperCase();
         
         char caracter;
                  
         for(int i= 0; i<texto.length(); i++){
             
             caracter = texto.charAt(i);
             int pos = letras.indexOf(caracter);
                     
             if (pos ==-1){
                 textoCodificado+=caracter;
             } else {
                 textoCodificado+=letras.charAt((pos+num)%letras.length());
             }
         }
         
         return textoCodificado;
     }
}
