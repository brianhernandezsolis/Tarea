/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail_2;

/**
 *
 * @author Brian
 */
import javax.swing.*;
public class Mail_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arroba=0;
        
         boolean punto=false;
        
        String mail=JOptionPane.showInputDialog("Introduce mail");
        
        for (int i=0; i<mail.length();i++){
            
            if(mail.charAt(i)=='@'){
                
                arroba++;
            }
        }
         //  if(mail.charAt(i)=='.'){
                
          //  punto=true;
         /*   
        }
        if(arroba==1 && punto==true){
            
            System.out.println("Es correcto");
        }
        else{
            System.out.println("No es correcto");
        }*/
    }
    
}
