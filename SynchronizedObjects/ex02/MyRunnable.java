package ex02;

import java.util.*;
import java.util.concurrent.locks.*;

public class MyRunnable implements Runnable{
    
    private int x;
    private int sum;
    private Random r = new Random();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    
    @Override
    public void run(){
        for (int i = 0; i < 50; i++){
            changeX();
            readX();
        }
    
    }
    
    /*
     * Separa codul in mai multe nivele: pe un lock de scriere si pe un lock de citire (separa nivele de sincronizare)
     * Se limiteaza intotdeauna la un singur fir de executie!
     */
    public void changeX(){
        lock.writeLock().lock();
        x = r.nextInt();
        lock.writeLock().unlock();
    }
    
    public void readX(){
        lock.readLock().lock();
        sum += x;
        lock.readLock().unlock();
    }
}