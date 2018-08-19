package ex01;

import java.util.concurrent.*;

/*
 * clasa MyRunnable nu este gresita, dar in practica este mai bine sa punem semaphore.release() pe un block finally
 *  ptr ca daca intre sempahore.acquire() si semaphore.release() am un set de instructiuni care poate arunca o exceptie
 *  atunci s-ar putea sa nu se mai ajunga la semaphore.release(). Daca nu se ajunge la release aplicatia s-ar putea sa se blocheze si sa se creeze un deadLock. 
 */

public class MyRunnableV2 implements Runnable{
    
    private int x;
    private Semaphore semaphore = new Semaphore(1);
   
    @Override
    public void run(){
        try{
            for (int i = 0; i <= 50; i++){
                try{
                    semaphore.acquire();
                    x++;
                    System.out.println(x);
                } finally{
                    semaphore.release();
                }
            }
        }catch (InterruptedException e){
                e.printStackTrace();
        }
    }
}