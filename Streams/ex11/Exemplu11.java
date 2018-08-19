package ex11;

import java.util.*;
import java.util.stream.*;

public class Exemplu11{
    public static void main(String [] args){
    
        List<Integer> list = Arrays.asList(3, 5, 7, 8);
        
        ArrayList<Integer> result =
            list.stream()
                .map(v -> v*v)
                //.collect(Collectors.toCollection(() -> new ArrayList<>()));
                .collect(Collectors.toCollection(ArrayList::new));
                
        System.out.println(result);
    }
}