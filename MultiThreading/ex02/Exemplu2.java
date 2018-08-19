package ex02;

public class Exemplu2{
    public static void main(String [] args){
        
        EvenNumbersRunnable enr1 = new EvenNumbersRunnable();
        EvenNumbersRunnablee enr2 = new EvenNumbersRunnablee();
        
        /*
         * enr.start(); enr nu este un Thread si nu ii pot da start
         */
        
        Thread t1 = new Thread(enr1);
        Thread t2 = new Thread(enr2);
        
        t1.start();
        t2.start();
        
        System.out.println("THE END");
        
    }
}