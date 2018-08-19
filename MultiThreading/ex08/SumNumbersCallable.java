package ex08;

import java.util.concurrent.*;
import java.util.*;

public class SumNumbersCallable implements Callable<Integer>{
    
    private List<Integer> numbers;
    
    
    public SumNumbersCallable(List<Integer> numbers){
        this.numbers = numbers;
    }
    
    @Override
    public Integer call(){
        return numbers.stream()
                .reduce(0, (a, b) -> a + b);
    }
}