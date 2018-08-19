package ex03;

import javax.swing.*;
import java.awt.*;

public class Fereastra3 extends JFrame{

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    
    public Fereastra3(){
        
        /*
         * daca vreau sa schimb alinierea
         * setLayout(new FlowLayout()); mijloc
         * setLayout(new FlowLayout(FlowLayout.RIGHT));
         * setLayout(new FlowLayout(FlowLayout.LEFT));
         */
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        b1 = new JButton("BUTTON 1");
        b2 = new JButton("BUTTON 2");
        b3 = new JButton("BUTTON 3");
        b4 = new JButton("BUTTON 4");
        b5 = new JButton("BUTTON 5");
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        
        setLocationRelativeTo(null);
        setSize(400, 400);
        setVisible(true);
    }
}