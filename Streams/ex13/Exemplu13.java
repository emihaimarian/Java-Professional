package ex13;

/*
 * Un produs are un nume si un pret, avem o lista de produse, facem media aritmetica a preturilor produselor
 */

import java.util.*;
import java.util.stream.*;

public class Exemplu13{
    public static void main (String [] args){
         
        List<Produs> produse = Arrays.asList(
            new Produs("ciocolata", 10), 
            new Produs("bere", 5));
        
        double mediaAritmeticaAProduselor = 
            produse.stream()
                .collect(Collectors.averagingInt(p -> p.pret));
                
        System.out.println(mediaAritmeticaAProduselor);
    }
}