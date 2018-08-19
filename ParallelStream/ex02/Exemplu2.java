package ex02;

import java.util.*;
import java.util.stream.*;

public class Exemplu2{
    
    public static void main(String [] args){
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        long t1 = System.currentTimeMillis();
        
        /*
         * Dureaza 3 secunde 
         */
        /* 
        list.parallelStream()
            .filter(i -> unCazExageratDeFiltrare(i))
            .forEach(System.out::println);
        */
       
        /*
         * Dureaza 9 secunde
         */
        list.stream()
            .filter(i -> unCazExageratDeFiltrare(i))
            .forEach(System.out::println);
            
        long t2 = System.currentTimeMillis();
        
        System.out.println("A durat " + (t2 - t1));
    }
    
    public static boolean unCazExageratDeFiltrare(Integer i){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
        return i % 2 == 0;
    }
}