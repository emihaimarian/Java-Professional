package ex02;

import java.util.concurrent.*;

public class NumbersRecursiveAction extends RecursiveAction{
    
    private int x;
    
    public NumbersRecursiveAction(int x){
        this.x = x;
    }
    
    @Override
    public void compute(){
        if (x < 10){
            invokeAll(new NumbersRecursiveAction(x + 1),
                new NumbersRecursiveAction(x + 2));
        } else {
            System.out.println(x);
        }
    }
}