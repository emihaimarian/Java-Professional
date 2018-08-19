package ex18;

import java.util.*;
import java.util.stream.*;

public class Exemplu18{
    public static void main(String [] args){
        List<String> list = Arrays.asList("a", "bb", "ccc", "ddd", "e", "ffff", "ggggg", "hhhhhh");
        
        Map<Integer, String> map =
            list.stream()
                .collect(
                    //Collectors.groupingBy(s -> s.length(),
                    Collectors.groupingBy(String::length,
                    Collectors.joining(",")));
        
        System.out.println(map);  
    }
}