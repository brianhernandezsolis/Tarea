/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalua_edad;

/**
 *
 * @author Brian
 */
import java.util.*;
import javax.swing.*;
public class Evalua_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        
        String nombre=JOptionPane.showInputDialog("Cual es Tu Nombre");
        
        String edad=JOptionPane.showInputDialog("Hola " + nombre + " Cual es tu edad");
        
        int edad_user=Integer.parseInt(edad);
        
       /*
        if(edad_user>=18){
            
            System.out.println(nombre + " Eres Mayor de Edad ");
                         
        }
        else{
            System.out.println(nombre + " Eres menor de edad");
        }
      
        */
       
       if(edad_user<18){
           
           System.out.println("Eres un Adolescente");
       }
       else if(edad_user<40){
           
           System.out.println("Eres Joven");
                   
       }
       else if(edad_user<65){
           System.out.println("Eres un Adulto");
       }
       else{
           System.out.println("Ya estas Grande, Cuidate");
       }
        
        
        
        
    }
    
}
