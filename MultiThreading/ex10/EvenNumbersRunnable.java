package ex10;


public class EvenNumbersRunnable implements Runnable{
    
    @Override
    public void run(){
        try{
            for (int i = 0; i <= 50; i+=2){
                System.out.println(i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}