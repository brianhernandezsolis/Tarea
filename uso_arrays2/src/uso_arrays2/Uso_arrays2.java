/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uso_arrays2;

/**
 *
 * @author Brian
 */
import javax.swing.*;
public class Uso_arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] paises=new String[8];
        
        for(int i=0;i<8;i++){
            
        paises[i]=JOptionPane.showInputDialog("Introduce Pais");
        
        
        
        
        
        /*paises[0]="Espa;a";
        paises[1]="Mexico";
        paises[2]="Colombia";
        paises[3]="Peru";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Ecuador";
        paises[7]="Venezuela";*/
        
        /*for(int i=0; i<paises.length;i++){
        
        System.out.println("Pais " + (i+1) + " " + paises[i]);
        
    }

            for(String elemento:paises){
                */
                System.out.println("Tu pais fav es " + paises);
                
            }
        
                
        
      
        
        
    }
    
}
