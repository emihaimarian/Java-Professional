package ex06;

import java.util.concurrent.*;

public class Exemplu6{
    public static void main(String [] args){
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        /*
         * Nu vreau sa se execute metoda asta acum si sa se astepte dupa ea ptr ca dureaza un timp
         * In ExecutorService este pusa executia metodei doSomethingAndReturnResult() (metoda care ar putea dura ceva timp)
         *  imi permite mie ca ea acum in timp ce se executa, eu sa pot executa alte lucruri in urma puneri task-ului in 
         *  pool-ul de fire de executie am primit o instanta de tipul Future care are tipul <String> fiind ca este tipul rezultatului metodei pe care am pus-o.
         */
        Future<String> f = service.submit(() -> doSomethingAndReturnResult());
        
        //si sa mai faca unele chestii
        //dupa multe instructiuni executate am nevoie in sfarsit de valoare
        
        try{
            /*
             * Daca se intrerupe task-ul in timpul executiei se arunca una dintre cele doua exceptii de mai jos 
             */
            String rezultat = f.get();
            System.out.println(rezultat);
        } //catch (Exception e) => cele exceptii pe care le tratam sunt mai jos
            catch(ExecutionException | InterruptedException e){
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
        
    }
    
    public static String doSomethingAndReturnResult(){
        return "result";
    }
}