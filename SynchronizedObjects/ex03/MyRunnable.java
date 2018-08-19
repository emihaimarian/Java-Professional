package ex03;

import java.util.concurrent.*;

public class MyRunnable implements Runnable{
    
    private CyclicBarrier barrier = new CyclicBarrier(2);
    
    @Override
    public void run(){
        try{
            for (int i = 1; i <= 50; i++){
                barrier.await();
                System.out.println(i);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}