package ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra2 extends JFrame{

    private JButton b1;
    private int x;
    
    public Fereastra2(){
        setLayout(new FlowLayout());
        b1 = new JButton("0");
        
        add(b1);
        b1.addActionListener(ev -> increment());
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void increment(){
        x++;
        b1.setText(String.valueOf(x));
    }
}