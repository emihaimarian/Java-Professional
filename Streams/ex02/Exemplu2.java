package ex02;

import java.util.*;
import java.util.stream.*;
/*
 * Scrieti o aplicatie care foloseste streamuri si genereaza 10 valori random intre [1, 1000]
 */

public class Exemplu2{
    public static void main(String [] args){
        Random r = new Random();
        
        Stream.generate(() -> r.nextInt(1000) + 1)
            .limit(10)
            .forEach(System.out::println);
    }
}