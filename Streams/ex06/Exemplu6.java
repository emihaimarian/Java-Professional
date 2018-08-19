package ex06;

/*
 * Avand o lista de nr intregi care poate contine valori duplicate, folosind clasa Stream, afisati suma nr distrincte
 */

import java.util.*;

public class Exemplu6{
    public static void main(String [] args){
        
        List<Integer> list = Arrays.asList(3, 4, 6, 6, 6, 6, 5, 4, 2, 1, 20);
        
        int sum = 
            list.stream()
                .distinct()
                .mapToInt(x -> x)
                .sum();
        
        System.out.println(sum);
    }
}