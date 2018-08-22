/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena_string;

/**
 *
 * @author Brian
 */
public class Cadena_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre="julio";
        /*Cambia el nombre de "Juan Pedro Tv"
        y mira la MAGIA 
        */
        
        System.out.println("Mi nombre es: " + nombre);
        
        System.out.println("Mi nombre tiene: " + nombre.length() + " letras");
        
        /* La funcion del metodo .length() es contar cuantos caracteres tiene la variable
        en este caso "nombre"
        */
        
        System.out.println("La primera letra de " + nombre + " es: " + nombre.charAt(0));
        
        /* La funcion del metodo .charAt(0); es decirnos
        la letra que esta en el valor que ingresemos
        */
        
        int ultima_letra;
        
        ultima_letra=nombre.length();
        
        System.out.println("La Ultima letra del nombre: " + nombre + " es: " + nombre.charAt(ultima_letra-1));
        
        System.out.println("Gracias por usar este programa, te saluda tu amig@: " + nombre);
        
        
    }
    
}
