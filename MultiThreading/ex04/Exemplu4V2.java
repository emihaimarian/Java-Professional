package ex04;

public class Exemplu4V2{
    public static void main(String [] args){
    
        XYRunnablee xyr = new XYRunnablee();
        
        Thread t1 = new Thread(xyr);
        Thread t2 = new Thread(xyr);
        
        t1.start();
        t2.start();
    }
}