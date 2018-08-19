package ex05;

import java.nio.file.*;

public class Exemplu5{
    public static void main(String [] args){
        Path p1 = Paths.get("A/B/C");
        Path p2 = Paths.get("A", "B", "C");
        
        System.out.println(p1.getClass());        
    }
}