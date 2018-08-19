package ex08;

import java.util.concurrent.*;
import java.util.*;

public class Exemplu7{
    public static void main(String [] args) throws Exception{
        
        List<Integer> list = Arrays.asList(5, 4, 7, 8, 5, 2);
        
        ExecutorService service = Executors.newFixedThreadPool(4);
        
        Future<Integer> f1 = service.submit(new SumNumbersCallable(list));
        Future<Integer> f2 = service.submit(new SumNumbersCallable(list));
        Future<Integer> f3 = service.submit(new SumNumbersCallable(list));
        
        System.out.println(f1.get() + " " + f2.get() + " " + f3.get());
    }
}