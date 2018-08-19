package ex01;

public class OddNumbersThreadd extends Thread{
    
    @Override
    public void run(){
        try{
            for(int i = 1; i <= 50; i+=2){
                System.out.println(i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}