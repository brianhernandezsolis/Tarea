/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Brian
 */
import java.util.*;
public class uso_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        
        Empleado empleado2=new Empleado("Ana Lopez", 95500, 1995, 06, 02);
        
       Empleado empleado3=new Empleado("Maria Martin", 105000, 2002, 03, 15);
       
       empleado1.subeSueldo((5));
       
       empleado2.subeSueldo(5);
       
       empleado3.subeSueldo(5);
       
       System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
        + " Fecha de Alta: " + empleado1.dameFecha());
       
       System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
        + " Fecha de Alta: " + empleado2.dameFecha());
       
       System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
        + " Fecha de Alta: " + empleado3.dameFecha());
       
        
    }
    
}

    class Empleado{
    
        public Empleado(String nom, double sue, int anio, int mes, int dia){
            
         nombre=nom;
         
         sueldo=sue;
         
         GregorianCalendar calendario=new GregorianCalendar(anio, mes-1, dia);
         
         altaContrato=calendario.getTime();
             
         
            
        }
        
        public String dameNombre(){ //getter
            
            return nombre;
            
        }
        
        public double dameSueldo() //getter
        {
            return sueldo;
            
        }
        
        public Date dameFecha(){
            
            return altaContrato;
            
        }
        
        public void subeSueldo(double porcentaje){ //setter
            
            double aumento=sueldo*porcentaje/100;
            
            sueldo+=aumento;
            
        }
        
        
        private String nombre;
        
        private double sueldo;
        
        private Date altaContrato;
        
        
}
