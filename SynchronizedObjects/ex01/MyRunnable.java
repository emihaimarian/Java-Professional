package ex01;

import java.util.concurrent.*;

public class MyRunnable implements Runnable{
    
    private int x;
    
    /*
     * new Semaphore(1) => 1 este nr maxim de fire de executie care va trece de semaphore
     *  daca punem 1 este aproximativ echivalent cu un block synchronized (ptr ca in synchronized permite trecerea unui singur fir de executie).
     * Semaphore are si un al doilea param - true sau fals
     *  true => semaphore fair -> permite trecerea firelor de executie in ordinea in care au venit la el.
     *  
     */
    private Semaphore semaphore = new Semaphore(1);
   
    @Override
    public void run(){
        try{
            for (int i = 0; i <= 50; i++){
                /*
                 * semaphore.acquire() => aici blocam firele de executie
                 * acquire propaga o exceptie => InterruptedException
                 */
                semaphore.acquire();
                x++;
                System.out.println(x);
            
                /*
                 * semaphore.relese() => aici trebuie sa eliberam semaphore-ul
                 */
                semaphore.release();
            }
        }catch (InterruptedException e){
                e.printStackTrace();
        }
    }
}