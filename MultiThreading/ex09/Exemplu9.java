package ex09;

import java.util.*;
import java.util.concurrent.*;

public class Exemplu9{
        public static void main(String [] args) throws Exception{
        
        List<Integer> list = Arrays.asList(5, 4, 7, 8, 5, 2);
        
        ExecutorService service = Executors.newCachedThreadPool();
        
        Future<Integer> f1 = service.submit(new SumNumbersCallable(list));
        Future<Integer> f2 = service.submit(new SumNumbersCallable(list));
        Future<Integer> f3 = service.submit(new SumNumbersCallable(list));
        
        System.out.println(f1.get() + " " + f2.get() + " " + f3.get());
    }
}