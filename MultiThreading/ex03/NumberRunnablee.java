package ex03;

public class NumberRunnablee implements Runnable{
    
    private int x;
    
    /*
     * Aici il sincronizam pe run
     * Thread.currentThread() => ia firul curent de executie si cu getName() iau numele firului de executie
     * 
     * orice alt fir de executie apeleaza pe run va astepta pana cand celalalt a terminat tot ce este in run (se executa intotdeauna unul dupa celalalt)
     *     
     */
    @Override
    public synchronized void run(){
        try{
            for(int i = 0; i <= 50; i++){
                x++;
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " " + x);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}