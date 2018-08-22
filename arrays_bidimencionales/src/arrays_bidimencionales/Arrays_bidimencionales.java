/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_bidimencionales;

/**
 *
 * @author Brian
 */

public class Arrays_bidimencionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matrix={
            {10,20,30,40,50},
            {60,70,80,90,100},
            {110,120,130,140,150},
            {160,170,180,190,200}
        };
          
          for(int i=0;i<4;i++){
              System.out.println();
              for(int j=0;j<5;j++){
                  System.out.print(matrix[i][j]+ " ");
              }
          }
    }
    
}
