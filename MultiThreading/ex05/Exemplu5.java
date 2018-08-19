package ex05;

import java.util.concurrent.*;

public class Exemplu5{
    public static void main(String [] args){
        
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        EvenNumbersRunnable enr = new EvenNumbersRunnable();
  
        service.execute(enr);
        /*
         * La sfarsit dupa ce nu mai folosim un ExecutorService trebuie sa ii facem shutdown
         * Doar in momentul in care ii facem shutdown pool-ul de executie se va inchide
         * Daca uitam sa ii facem shutdown aplicatia efectiv nu se termina ptr ca inca existe fire de executie in executie(in pool)
         * Exista 2 metode pe care un Executor le poate folosi pentru a se inchide: 
         *  shutdown() - in momentul in care este apelata asteapta sa se termine toate taskurile care exista in executorService, nu primeste noi task-uri.
         *  shutdownNow() -  care incearca sa forteze inchiderea ExecutorService-ului si apoi inchide si ExecutorService (nu garanteaza ca reuseste sa inchida taskurile din interior)
         *   de ex daca un fir de executie se afla in stagiul blocked acesta nu va fi intrerupt si nu se va arunca InterruptedException.(nu se recomanda folosirea).
         */
        service.shutdown();
        //service.shutdownNow();
    }
}