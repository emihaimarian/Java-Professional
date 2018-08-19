package ex09;

/*
 * Avem o lista de numere intregi si vrem sa obtinem lista acestor valori ridicate patrat
 */

import java.util.*;
import java.util.stream.*;

public class Exemplu9{
    public static void main(String [] args){
        
        List<Integer> list = Arrays.asList(3, 5, 7, 8);
        
        List<Integer> result = 
            list.stream()
                .map(v -> v*v)
                .collect(Collectors.toList());
        
        System.out.println(result);
    }
}