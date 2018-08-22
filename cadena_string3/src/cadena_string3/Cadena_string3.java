/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena_string3;

/**
 *
 * @author Brian
 */
public class Cadena_string3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String alumno1, alumno2;
        
        alumno1="David";
        alumno2="david";
        
        System.out.println(alumno1.equals(alumno2));
        
        /* Lo que hace .equals(); es comparar dos cadenas de tipo String
        y si son iguales devolvera true, y si son diferentes dovolvera false,
        se toma en cuenta que este metodo diferencia entre mayusculas 
        y minusculas
        */
        
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
        /* Ahora .equalsIgnoreCase, es practicamente lo mismo pero este
        ignora las mayusculas y minusculas
        */
        
    }
    
}
