package ex03;

public class NumberRunnableee implements Runnable{
    
    private int x;
    
    /*
     * il pot folosi si pe this ca monitor si este instanta de NumberRunnableee(nbr1) care este acelasi ptr ambele fire de executie
     */
    @Override
    public void run(){
        try{
            for(int i = 0; i <= 50; i++){
                synchronized(this){
                    x++;
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + " " + x);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}