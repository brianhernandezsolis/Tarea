/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfases.y.clases.internas.i;

/**
 *
 * @author Brian
 */
import java.util.*
public class InterfasesYClasesInternasI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    

        Scanner entrada = new Scanner(System.in); 
        int arreglo[],numero; 
        boolean creciente = true; 
        
        arreglo = new int [10]; //se crea el arreglo con 10 posiciones
        do{
            //pedimos el arreglo 
            System.out.println("Rellene el arreglo: "); 
            for(int i=0; i<10; i++){
            System.out.print(i+". Digite un numero: "); 
            arreglo[i] = entrada.nextInt(); 
            }
            //verificamos si el arreglo esa ordenado 
            
            for(int i = 0; i<9; i++){
                if(arreglo[i] < arreglo[i+1]){//creciente 1 2 3...
                    creciente = true; 
                }
                if(arreglo[i] > arreglo[i+1]){//decreciente
                    creciente = false; 
                    break; 
                }
            }
            
        }while(creciente == false); 
        
        //Pedimos el numero a buscar 
        System.out.println("\nDigite el nuemero a buscar en el arreglo"); 
        numero = entrada.nextInt(); 
        
        //buscamos el numero en el arreglo 
        int i = 0; 
        
        while(i<10 && arreglo[i]<numero){
            i++;
        }
        
        if(i==10){
            System.out.println("\nNumero encontrado: "+i);
        }else{
            System.out.println("\nNumero no encontrado"); 
        }
    }
    
}
