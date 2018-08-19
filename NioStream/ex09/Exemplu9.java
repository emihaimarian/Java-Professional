package ex09;

import java.nio.file.*;

public class Exemplu9{
    public static void main(String [] args){
        /*
         * Concat paths
         */
        Path p1 = Paths.get("A/B");
        Path p2 = Paths.get("C/D");
        
        Path p3 = Paths.get("A/B");
        Path p4 = Paths.get("C/D");
        
        Path p5 = Paths.get("C:/A/B");
        Path p6 = Paths.get("C/D");
        
        Path p7 = Paths.get("A/B");
        Path p8 = Paths.get("C:/C/D");
        
        Path result = p1.resolve(p2);
        System.out.println(result);
        
        Path result2 = p4.resolve(p3);
        System.out.println(result2);
        
        Path result3 = p5.resolve(p6);
        System.out.println(result3);
        
        Path result4 = p7.resolve(p8);
        System.out.println(result4);
    }
}