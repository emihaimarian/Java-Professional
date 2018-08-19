package ex03;

import java.util.*;
import java.util.concurrent.*;

public class SqrtNumbersAction extends RecursiveAction{

    private int i, j;
    private List<Integer> numbers;
    
    public SqrtNumbersAction(List<Integer> numbers, int i, int j){
        this.numbers = numbers;
        this.i = i;
        this.j = j;    
    }
    
    @Override
    public void compute(){
        
        if(j - i < 3){
            for (int k = i; k < j; k++){
                System.out.println(Math.sqrt(numbers.get(k)));
            }
        } else{
            int mid = (i + j) / 2;
            invokeAll(new SqrtNumbersAction(numbers, i, mid), new SqrtNumbersAction(numbers, mid, j));
        }
    }
}