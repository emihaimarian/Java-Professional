package ex02;

import java.util.concurrent.*;

public class Exemplu2{
    
    public static void main(String [] args){
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new NumbersRecursiveAction(1));
    }
}