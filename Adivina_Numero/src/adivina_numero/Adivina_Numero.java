/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina_numero;

/**
 *
 * @author Brian
 */
import java.util.*;
public class Adivina_Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aleatorio=(int)(Math.random()*100);
        
        
        
        Scanner entrada=new Scanner(System.in);
        
        int numero=0;
        
        int intentos=0;
        
        System.out.println("Introduce un numero, por favor");
        
        /*while(numero!=aleatorio){
            
            intentos++;
            
            numero=entrada.nextInt();
            
            if(aleatorio<numero){
                System.out.println("Ingresa un numero mas bajo");
                
            }
            else if(aleatorio>numero){
                System.out.println("Ingresa un numero mas alto");
            
            
        }
            
        
        
        
    }
        System.out.println("Correcto");
        System.out.println("Tus intentos fallidos fueron: " + intentos);
        System.out.println("---Gracias por jugar---");
        
        Este es un ejemplo del While, y a continuacion del do while
   
*/
        do{
            
            intentos++;
            
            numero=entrada.nextInt();
            
            if(aleatorio<numero){
                System.out.println("Ingresa un numero mas bajo");
                
            }
            else if(aleatorio>numero){
                System.out.println("Ingresa un numero mas alto");
            
            
        }
            
        
        
        
    }while(numero!=aleatorio);
        System.out.println("Correcto");
        System.out.println("Tus intentos fallidos fueron: " + intentos);
        System.out.println("---Gracias por jugar---");

}
    
}

