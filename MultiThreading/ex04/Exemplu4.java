package ex04;

public class Exemplu4{
    public static void main(String [] args){
    
        XYRunnable xyr = new XYRunnable();
        
        Thread t1 = new Thread(xyr);
        Thread t2 = new Thread(xyr);
        
        t1.start();
        t2.start();
    }
}