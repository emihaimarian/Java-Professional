package ex04;

public class XYRunnable implements Runnable{
    
    private int x;
    private int y;
    
    @Override
    public void run(){
        try{
            while(true){
                synchronized(this){
                    x++;
                    y++;
                
                    System.out.println(x + " " + y);
                    Thread.sleep(1000);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}