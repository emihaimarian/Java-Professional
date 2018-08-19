package ex11;

import java.nio.file.*;
import java.io.File;

public class Exemplu11{
    public static void main(String [] args){
        Path p1 = Paths.get("A/B/C/./../../././X/Y/Z/../../Q/W/./E");
        
        /* 
         * How normalize works: 
         * Step 1: "A/B/C/../../X/Y/Z/../../Q/W/E"
         * Step 2: "A/B/../X/Y/Z/../../Q/W/E"
         * Step 3: "A/X/Y/Z/../../Q/W/E"
         * Step 4: "A/X/Y/../Q/W/E"
         * Step 5: "A/X/Q/W/E"
         * 
         * Reduce calea la o cale cat de scurta posibil
         */
        
        Path p2 = p1.normalize();
        System.out.println(p2);
        
        /*
         * Transforma path-ul in file
         */
        
        File f = p2.toFile();
        
        /*
         * Transforma file in path
         */
        Path p3 = f.toPath();
        
        
        
    }
}