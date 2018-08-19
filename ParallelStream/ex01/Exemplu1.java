package ex01;


import java.util.*;
import java.util.stream.*;

public class Exemplu1{
    public static void main(String [] args){
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        //list.parallelStream().forEach(System.out::println);\
        
        /*
         * forEachOrdered - le asteapta sa le reordoneze (face o sincronizate)
         *  ptr ca elem sa fie luate in ordinea in din care au plecat din sursa
         */
        list.parallelStream().forEachOrdered(System.out::println);
    }
}