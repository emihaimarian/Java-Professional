package ex11;

import java.util.concurrent.*;

public class Exemplu11{
    public static void main(String [] args) throws Exception{
        
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        
        service.scheduleAtFixedRate(new EvenNumbersRunnable(), 1, 1, TimeUnit.SECONDS);
        
        Thread.sleep(10000);
        
        service.shutdown();
    }
}