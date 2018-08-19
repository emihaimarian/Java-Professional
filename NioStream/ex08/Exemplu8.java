package ex08;

import java.nio.file.*;

public class Exemplu8{
    public static void main(String [] args){
        Path p1 = Paths.get("C:/A/B/C/D/E");
        
        /* 
         * Luam o partea dintr-un path indexarea incepe de la 0 dar fara root 
         */
        
        Path sp = p1.subpath(1, 3);
        System.out.println(sp);
    }
}