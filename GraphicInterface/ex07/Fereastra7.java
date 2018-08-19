package ex07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra7 extends JFrame{

    private JMenuBar mb;
    private JMenu m1;
    private JMenu m2;
    private JMenu sub1;
    
    private JMenuItem mi1, mi2, mi3, mi4, mi5;
    
    public Fereastra7(){
        
        mb = new JMenuBar();
        setJMenuBar(mb);
        
        m1 = new JMenu("MENU 1");
        m2 = new JMenu("MENU 2");
        
        mb.add(m1);
        mb.add(m2);
        
        sub1 = new JMenu("SUBMENU 1");
        mi1 = new JMenuItem("ITEM 1");
        m1.add(sub1);
        m1.add(mi1);
        
        mi2 = new JMenuItem("ITEM 2");
        mi3 = new JMenuItem("ITEM 3");
        mi4 = new JMenuItem("ITEM 4");
        
        sub1.add(mi2);
        sub1.add(mi3);
        sub1.add(mi4);
        
        mi5 = new JMenuItem("ITEM 5");
        m2.add(mi5);
        
        mi1.addActionListener(ev -> sayHello());
        KeyStroke ks1 = KeyStroke.getKeyStroke("control alt W");
        mi1.setAccelerator(ks1);
        /*
         * alt + M
         */
        m1.setMnemonic('M');
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    private void sayHello(){
        JOptionPane.showMessageDialog(null, "HELLO");
    }
}