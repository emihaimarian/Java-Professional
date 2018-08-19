package ex16;

/*
 * Avand o lista de siruri de caractere, grupati sirurile de caractere dupa lungimile lor 
 */

import java.util.*;
import java.util.stream.*;

public class Exemplu16{
    public static void main(String [] args){
        List<String> list = Arrays.asList("a", "bb", "ccc", "ddd", "e", "ffff", "ggggg", "hhhhhh");
        
        Map<Integer, List<String>> map =
            list.stream()
                .collect(Collectors.groupingBy(s -> s.length()));
        
        System.out.println(map);  
    }
}