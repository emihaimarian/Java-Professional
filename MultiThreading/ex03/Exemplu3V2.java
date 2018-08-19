package ex03;

public class Exemplu3V2{
    public static void main(String [] args){
        
        NumberRunnablee nbr1 = new NumberRunnablee();
        
        Thread t1 = new Thread(nbr1, "Thread t1");
        Thread t2 = new Thread(nbr1, "Thread t2");
        
        t1.start();
        t2.start();
    }
}