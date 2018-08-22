/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventossi;

/**
 *
 * @author Brian
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventossI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          MarcoBotones mimacro=new MarcoBotones(); 
        
        mimacro.setVisible(true); 
        
        mimacro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
    }
    
}

class MarcoBotones extends JFrame{
    public MarcoBotones(){
        setTitle("Botones y Eventos"); 
        setBounds(700,300,500,300);
        LaminaBotones miLamina = new LaminaBotones(); 
        add(miLamina);
        
    }
            
}

class LaminaBotones extends JPanel  {
        

    }
    

