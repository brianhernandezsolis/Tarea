/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video_52;

/**
 *
 * @author Brian
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Video_52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos, aux;//le asignamos el numero de elementos al arreglo
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos: "));
        
        arreglo = new int [nElementos]; 
        for(int i=0; i<nElementos; i++){
            System.out.println((i+1)+" Digite un numero: ");
            arreglo[i] = entrada.nextInt(); 
        }
        
        for(int x = 0; x<(nElementos-1); x++){
            for( int y = 0; y<(nElementos-1); y++){
            if(arreglo[y] > arreglo[y+1]){ //si numero actual es mayor a numero siguiente 
                aux = arreglo[y];
                arreglo[y] = arreglo[y+1]; 
                arreglo[y+1] = aux; 
            }
            
        }
        
    }
    
        //mostramos el arreglo ordenado en forma creciente 
       System.out.print("\nArreglo ordenado en forma creciente: ");  
       for(int i=0; i<nElementos; i++){
           System.out.println(arreglo[i]+ " - "); 
           
       }
      System.out.println("\nArreglo en forma decreciente: ");
      for(int i=(nElementos-1); i>=0; i--){
      System.out.print(arreglo[i]+ " - ");
      } 
      
     System.out.print("");
        
    }
    
}
