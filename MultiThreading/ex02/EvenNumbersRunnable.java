package ex02;

import java.util.stream.*;

public class EvenNumbersRunnable implements Runnable{
    
    @Override
    public void run(){
        Stream.iterate(0, i -> i + 2)
            .limit(50)
            .forEach(System.out::println);
    }
}