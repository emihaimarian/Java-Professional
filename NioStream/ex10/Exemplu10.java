package ex10;

import java.nio.file.*;

public class Exemplu10{
    public static void main(String [] args){
        Path p1 = Paths.get("A/B/C/D");
        Path p2 = Paths.get("A/B/X/Y");
        
        Path p3 = Paths.get("C:/A/B/C/D");
        Path p4 = Paths.get("C:/A/B/X/Y");
        
        /*
         * Path p5 = Paths.get("C:/A/B/C/D");
         * Path p6 = Paths.get("A/B/X/Y");
         */
        
        /* 
         * Modalitate de a da o cale relativa dintr-un path in alt path
         * Reguli: arunca exceptii de Runtime(unchecked) in cazul in care ii dam sa faca relativizarea intr-o cale absoluta si una relativa
         * IllegalArgumentException
         */
        
        System.out.println("p1 and p2 are relative paths");
        Path result = p1.relativize(p2);
        System.out.println(result);
        
        System.out.println();
        
        System.out.println("p3 and p4 are absolute paths");
        Path result2 = p3.relativize(p4);
        System.out.println(result);
        
        System.out.println();
        
        /*
         * System.out.println("Throwing IllegalArgumentException because you can`t concat relative and absolute path with this method");
         * Path result3 = p5.relativize(p6);
         * System.out.println(result3);
         */
        
    }
}