package ex01;

import java.util.*;
import java.util.stream.*;

public class Exemplu1{
    
    public static void main(String [] args){
    
        List <Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 9);
    
        List<Integer> syncList = Collections.synchronizedList(list);
    
        syncList.forEach(System.out::println);
   }
   
   public List<Integer> metodaCareReturneazaLista(){
        
        List<Integer> list;
        
        try{
            list = Stream.iterate(0, i -> i + 1)
                .limit(10)
                .collect(Collectors.toList());
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        
        // greseala return null;
        return Collections.emptyList();
   }
}