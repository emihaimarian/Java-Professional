package ex04;

import java.util.concurrent.atomic.*;

public class MyRunnable implements Runnable{
    
    private AtomicInteger x = new AtomicInteger(0);
    
    /*
     * ptr ca folosesc o clasa atomica nu am nevoie de block synchronize
     */
    @Override
    public void run(){
        for (int i = 0; i < 50; i++){
            System.out.println(x.incrementAndGet());
        }
    }
}