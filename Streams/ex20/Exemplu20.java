package ex20;

/*
 * Obtinem nr de elemente grupate dupa lungime
 */
import java.util.*;
import java.util.stream.*;

public class Exemplu20{
    public static void main(String [] args){
        
        List<String> list = Arrays.asList("aa", "bbb", "cc", "dddddd", "eeeeeeee");
        
        Map<Integer, Long> map =
            list.stream()
                .collect(
                    Collectors.groupingBy(String::length, 
                        Collectors.counting()));
        
        System.out.println(map);
    }
}