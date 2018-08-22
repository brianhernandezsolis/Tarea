/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creciondemenus;

/**
 *
 * @author Brian
 */

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class CreciondeMenus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MenuFrame mimarco = new MenuFrame(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

class MenuFrame extends JFrame {
     
    public MenuFrame(){
        
        setBounds(500,300,550,400);
        MenuLamina milamina = new MenuLamina(); 
        add(milamina); 
        setVisible(true); 
    }
}
class MenuLamina extends JPanel{
    
    public MenuLamina(){
        JMenuBar mibarra = new JMenuBar(); 
        JMenu archivo = new JMenu("Archivo"); 
        JMenu edicion = new JMenu("Edicion"); 
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardar_como = new JMenuItem("Guardar como");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem opcion1 = new JMenuItem("Opcion 1"); 
        
        edicion.add(opciones); 
        opciones.add(opcion1); 
        archivo.add(guardar); 
        archivo.add(guardar_como); 
        edicion.add(cortar); 
        edicion.add(copiar); 
        edicion.addSeparator();
        herramientas.add(generales); 
        mibarra.add(archivo); 
        mibarra.add(edicion); 
        mibarra.add(herramientas); 
        add(mibarra); 
        
    }
    
}
