package ex03;

import java.util.*;
import java.util.concurrent.*;

public class Exemplu3{
    public static void main(String [] args){
        
        List<Integer> list = Arrays.asList(4, 16, 32, 64, 81, 100);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new SqrtNumbersAction(list, 0, list.size()));
    }
}