package ex03;

public class NumberRunnable implements Runnable{
    
    private int x;
    
    @Override
    public void run(){
        
        for(int i = 0; i <= 50; i++){
            x++;
            System.out.println(x);
        }
    }
}