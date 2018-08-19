package ex03;

public class Exemplu3V3{

    public static void main(String [] args){
        
        NumberRunnableee nbr1 = new NumberRunnableee();
        
        Thread t1 = new Thread(nbr1, "Thread t1");
        Thread t2 = new Thread(nbr1, "Thread t2");
        
        t1.start();
        t2.start();
    }
}