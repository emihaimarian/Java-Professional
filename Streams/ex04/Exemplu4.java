package ex04;

/*
 * Scrieti o aplicatie folosind clasa Stream care pentru o lista de siruri de caractere afiseaza true daca toate sirurile au lungime para
 */

import java.util.*;

public class Exemplu4{
    public static void main (String [] args){
        
        List<String> list = Arrays.asList("AA", "BBBBBB", "CC", "DDD", "EEEEEE");
        
        /*
         * allMatch ne spune daca toate respecta predicatul
         */
        boolean b1 = 
            list.stream()
                .map(s -> s.length())
                .allMatch(n -> n % 2 == 0);
        /*
         * anyMatch ne spune daca vreuna dintre ele respecta predicatul
         */      
        boolean b2 = 
            list.stream()
                .map(s -> s.length())
                .anyMatch(n -> n % 2 == 0);
        
        /*
         * noneMatch ne spune daca niciuna nu respecta predicatul
         */
        boolean b3 =
            list.stream()
                .map(s -> s.length())
                .noneMatch(n -> n % 2 == 0);
                
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}