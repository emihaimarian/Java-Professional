package ex06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra6 extends JFrame{
    
    private JButton [] b = new JButton[12];
    
    public Fereastra6(){
        setLayout(new GridLayout(4,3));
        
        for (int i = 0; i < b.length; i++){
            b[i] = new JButton(String.valueOf(i + 1));
            add(b[i]);
        }
        
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}