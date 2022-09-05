/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Cifrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        cifrar obj = new cifrar();
        decifrar obje = new decifrar();
        
        
        String letras="ABCDEFGHIJKLMNÑOPQRSTUV";
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog("que desea hacer?\n 1-Cifrar\n 2-Decifrar"));
        
        boolean flag = opc==1;
        
        if (flag==true){
            String frase = JOptionPane.showInputDialog("Ingresa las letras o frase");
        
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de posciones"));

            String texto =obj.codificar(letras, frase, num);
            JOptionPane.showMessageDialog(null, "Texto codificado:\n "+texto);
            
            
        } else {
            String frase = JOptionPane.showInputDialog("Ingresa el texto a decifrar");
        
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ibgrese el número de posciones"));

            String texto =obje.decodificar(letras, frase, num);
            JOptionPane.showMessageDialog(null, "Texto decodificado:\n "+texto);
        }
               
        
        
        
    }
    
}
