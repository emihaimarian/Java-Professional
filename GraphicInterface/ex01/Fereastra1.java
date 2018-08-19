package ex01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra1 extends JFrame{
    
    private JButton buton;
    
    public Fereastra1(){
        super("Titlu 1");
        
        buton = new JButton("Hello");
        this.add(buton);
        this.setLayout(new FlowLayout());
        //buton.setBackground(Color.RED);
       
        buton.addActionListener(ev -> evenimentButon());
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void evenimentButon(){
        if(buton.getText().equals("Hello")){
            buton.setText("World!");
        } else {
            buton.setText("Hello");
        }
    }
}