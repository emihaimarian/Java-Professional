package ex04;

import javax.swing.*;
import java.awt.*;

public class Fereastra4 extends JFrame{

    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    
    public Fereastra4(){
        
        b1 = new JButton("BUTTON 1");
        b2 = new JButton("BUTTON 2");
        b3 = new JButton("BUTTON 3");
        b4 = new JButton("BUTTON 4");
        b5 = new JButton("BUTTON 5");
        
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5);
        
        setLocationRelativeTo(null);
        setSize(400, 400);
        setVisible(true);
    }
}