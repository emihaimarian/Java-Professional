package ex03;

public class Exemplu3{
    public static void main(String [] args){
        NumberRunnable nbr = new NumberRunnable();
        
        Thread t1 = new Thread(nbr);
        Thread t2 = new Thread(nbr);
        
        /*
         * Exista posibilitatea sa se ajunga in situatia in care firele de executie 
         *  incrementeaza de 2 ori dupa care afiseaza eventual aceiasi valoare.
         *  
         *  Firele de executie au voie sa itereze in paralel, 
         *   lucreaza la aceiasi resursa deci concureaza ptr aceiasi resursa. (race condition)
         */
        t1.start();
        t2.start();
    }
}