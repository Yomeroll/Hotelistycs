/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IGU;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author scben
 */
public class metodosVentanas {
    
    public void cambiarPanelConfig(JPanel p, JPanel c){
        
        p.setSize(700, 670);
        p.setLocation(0, 0);
        
        c.removeAll();
        c.add(p, BorderLayout.CENTER);
        c.revalidate();
        c.repaint();
        
    
    }
    
}
