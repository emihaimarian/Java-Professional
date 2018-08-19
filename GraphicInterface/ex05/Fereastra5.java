package ex05;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Fereastra5 extends JFrame{

    private JPanel p1, p2;
    private JButton b1, b2, b3;
    
    public Fereastra5(){
        
        p1 = new JPanel();
        p2 = new JPanel();
         
        b1 = new JButton("RED");
        b2 = new JButton("BLUE");
        b3 = new JButton("YELLOW");
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        
        b1.addActionListener(e -> coloreazaCuRosu());
        b2.addActionListener(e -> coloreazaCuAlbastru());
        b3.addActionListener(e -> coloreazaCuGalben());
        
        add(p2);
        add(p1, BorderLayout.SOUTH);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void coloreazaCuRosu(){
        p2.setBackground(Color.RED);
    }
    
    private void coloreazaCuAlbastru(){
        p2.setBackground(Color.BLUE);
    }
    
    private void coloreazaCuGalben(){
        p2.setBackground(Color.YELLOW);
    }
}