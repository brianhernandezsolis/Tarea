/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada_ejemplo2;

/**
 *
 * @author Brian
 */
import javax.swing.*;
public class Entrada_ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre_usuario=JOptionPane.showInputDialog("Introduce Tu Nombre Por Favor");
        
        /*Esta anterior sirve para guardar una cadena tipo string
        pero con ventana auxiliar
        */
        
        String edad=JOptionPane.showInputDialog("Introduce tu edad");
        
        int edad_usuario=Integer.parseInt(edad);
        
        System.out.println("Hola " + nombre_usuario + " tu edad es " + edad
        + " Y el proximo anio tendras: " + (edad_usuario+1) + " anios");
        
        String resultado=JOptionPane.showInputDialog("El Proximo Anio tendras: " + (edad_usuario+1));
        
    }
    
}
