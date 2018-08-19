package ex05;

/*
 * Folosind clasa Stream afisati nr sirurilor cu lungime para
 */

import java.util.*;

public class Exemplu5{
    public static void main(String [] args){
        
        List<String> list = Arrays.asList("AA", "BBBBB", "C", "DDDDD", "EEE");
        
        long nr =
            list.stream()
                .filter(x -> x.length() % 2 == 0)
                .count();
        
        System.out.println(nr);
    }
}