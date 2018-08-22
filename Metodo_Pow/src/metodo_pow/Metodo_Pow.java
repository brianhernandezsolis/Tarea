/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_pow;

/**
 *
 * @author Brian
 */
public class Metodo_Pow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double base=5;
        
        double exponente=3;
        
        /*int resultado=(int)Math.pow(base, exponente); Este es 
        para convertirlo a entero
        */
        
        double resultado=Math.pow(base, exponente);
        
        
        System.out.println(resultado);
        
        
    }
    
}
