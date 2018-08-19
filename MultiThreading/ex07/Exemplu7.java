package ex07;

import java.util.concurrent.*;
import java.util.*;

/*
 * Avand o lista de valori numerice, calculati suma acestor valori pe un fir separat de executie si afisati rezultatul.
 */
public class Exemplu7{
    public static void main(String [] args) throws Exception{
        
        List<Integer> list = Arrays.asList(5, 4, 8, 9, 6, 5, 2);
        
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> f = service.submit(new SumNumbersCallable(list));
        System.out.println(f.get());
        
        service.shutdown();
    }
}