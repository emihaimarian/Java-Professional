package ex10;

/*
 * Avem o lista de numere intregi si vrem sa obtinem lista acestor valori ridicate patrat
 */

import java.util.*;
import java.util.stream.*;

public class Exemplu10{
    public static void main(String [] args){
        
        List<Integer> list = Arrays.asList(3, 5, 7, 8);
        
        Set<Integer> result = 
            list.stream()
                .map(v -> v*v)
                .collect(Collectors.toSet());
        
        System.out.println(result);
    }
}