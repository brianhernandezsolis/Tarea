/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosii;

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

public class EventosII {

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

class LaminaBotones extends JPanel implements ActionListener {

      JButton botonAzul = new JButton("Azul");
      JButton botonAmarillo = new JButton("Amarillo"); 
      JButton botonRojo = new JButton("Rojo");
              
     public LaminaBotones(){

        add(botonAzul); 
        add(botonAmarillo); 
        add(botonRojo); 
        botonAzul.addActionListener(this); 
        botonAmarillo.addActionListener(this); 
        botonRojo.addActionListener(this); 
     }
     
    public void actionPerformed(ActionEvent e){
        Object botonPulsado=e.getSource(); 
        
        if(botonPulsado == botonAzul){
            setBackground(Color.blue); 
        }else if(botonPulsado == botonAmarillo){
            setBackground(Color.YELLOW); 
        }
        else {
            setBackground(Color.red);
        } 
        
    }
    
}
