package ex04;

public class XYRunnablee implements Runnable{
    
    private int x;
    
    @Override
    public void run(){
        try{
            while(true){
                /*
                 * Pe mai multe fire de executie este intotdeauna x-ul consecutiv?
                 * Nu, pentru ca avem doua instructiuni, preluarea valorii lui x apoi incrementarea.
                 * Este la fel de posibil ca ambele fire de executie sa afiseze 1 1 dupa care ambele sa il incrementeze in acelasi timp si el sa devina 3
                 */
                Thread.sleep(100);
                System.out.println(x++);
   
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}