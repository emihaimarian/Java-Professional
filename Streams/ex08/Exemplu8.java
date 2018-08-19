package ex08;

/*
 * Avand o lista de siruri de caractere afisati lungimile sirurilor separate prin virgula
 */
import java.util.*;
import java.util.stream.*;

public class Exemplu8{
    public static void main (String [] args){
        
        /*
         * Metoda Collect este o operatie terminala, ea primeste ca param un collector, iar collectorul este regula pe care o foloseste 
         * ca sa colecteze mai multe valori intr-o singura valoare (joining)
         */
        
        List<String> list = Arrays.asList("aaa", "bb", "c", "ddddddd", "eeeee");
        
        String result = 
            list.stream()
                .map(s -> String.valueOf(s.length()))
                .collect(Collectors.joining(","));
                
        System.out.println(result);
    }
}