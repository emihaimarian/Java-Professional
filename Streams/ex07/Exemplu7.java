package ex07;

/*
 * Avand o lista de siruri de caractere afisati nr total al vocalelor
 */

import java.util.*;

public class Exemplu7{
    public static void main(String [] args){
        
        List<String> list = Arrays.asList("Hello", "World", "Park", "Piano", "Cat");
        
        /*
         * "\\s"  imparte in cuvinte 
         * "\\s*" imparte in litere
         */
        
        long nr = 
            list.stream()
                .map(s -> Arrays.asList(s.split("\\s*")))
                .flatMap(q -> q.stream())
                .filter(c -> "aeiou".contains(c.toLowerCase()))
                .count();
                
        System.out.println(nr);
    }
}