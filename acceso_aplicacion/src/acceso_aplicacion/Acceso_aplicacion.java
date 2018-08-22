/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_aplicacion;

/**
 *
 * @author Brian
 */
import javax.swing.*;
public class Acceso_aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave="Brian";
        
        String pass="";
        
        while (clave.equals(pass)==false){
            
            pass=JOptionPane.showInputDialog("Introduce el Password");
            
            if (clave.equals(pass)==false){
                
                System.out.println("Contrase;a Incorrecta");
                
            }
            
         
        }
        
        System.out.println("Contrase;a correcta, Acceso Permitido");
        
    }
    
}
