package ex12;

/*
 * Avand o lista de liste de siruri de caractere obtineti o lista a lungimilor distincte din toate sirurile si sortate in ordine crescatoare
 */

import java.util.*;
import java.util.stream.*;

public class Exemplu12{
    public static void main(String [] args){
        
        List<List<String>> list = new ArrayList<>();
        
        list.add(Arrays.asList("aaa", "bbbbbbb", "cc", "dddd"));
        list.add(Arrays.asList("e", "ffff", "ggggggg", "hhhhhhhh"));
        list.add(Arrays.asList("iiiiiii", "jjjj", "kkk", "lllllll"));
        
        List<Integer> values =
            list.stream()
                /*
                 * In flatMap intra niste liste de stringuri, iar din liste de stringuri vreau sa transform stringurile din interior in streamuri
                 * List -> String
                 * String -> Integer (lungime)
                 * distinct -> unice
                 * sort -> sorteaza crescator
                 */
                .flatMap(k -> k.stream())
                .map(s -> s.length())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
                
        System.out.println(values);
    }
}