 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena_string2;

/**
 *
 * @author Brian
 */
public class Cadena_String2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase="Hoy es un estupendo dia para aprender a programar en Java";
        
        String frase_resumen=frase.substring(29, 57);
        
        /* Lo que hace .substring es, los valores que lo asignamos,
        mostrarlos en pantalla, desde 29 hasta 57, que son los valores que 
        asignamos 
        */
        
        System.out.println(frase_resumen + " es Genial");
        
        /* En esta impresion en pantalla, le concatenamos la frase
        "es Genial" con el signo + (de concatenar)
        */
        
                      
        
    }
    
}
