package ex10;

import java.util.concurrent.*;
import java.util.*;

public class Exemplu10{
    public static void main(String [] args) throws Exception{
        
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        
        //service.scheduleAtFixedRate(new EvenNumbersRunnable(), 3, 5, TimeUnit.SECONDS);
        
        /*
         * Diferenta intre scheduleAtFixedRate si scheduleWithFixedDelay:
         *  scheduleAtFixedRate - 
         *   cand pun task-ul incep sa se scurga cele 5 secunde 
         *  (daca task-ul dureaza mai mult de 5 secunde este posibil ca primul task pus sa nu se fi terminat cand incepe cel de al doilea)
         *  
         *  scheduleWithFixedDelay -
         *  intotdeauna task-ul s-a incheiat anterior inainte sa inceapa primul (asteapta sa inchida task-ul dupa care trec 5 sec dupa care porneste al doilea task)
         */
        service.scheduleWithFixedDelay(new EvenNumbersRunnable(), 3, 5, TimeUnit.SECONDS);
        
        /*
         * Daca nu folosim shutdown() o sa ruleze la infinit si asa il oprim la 15 sec
         */
        Thread.sleep(15000);
        service.shutdown();
    }
}