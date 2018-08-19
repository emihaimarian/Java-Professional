package ex19;

/*
 * Avand o lista de siruri de caractere, grupati sirurile cu lungime para si sirurile de lungime impara
 */

import java.util.*;
import java.util.stream.*;

public class Exemplu19{
    public static void main(String [] args){
        
        List<String> list = Arrays.asList("a", "bb", "ccc", "dddd", "eeeee");
        
        Map<Boolean, List<String>> map = 
            list.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));
            
        System.out.println(map);
    }
}