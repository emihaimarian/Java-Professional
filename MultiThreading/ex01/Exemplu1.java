package ex01;

public class Exemplu1{
    public static void main(String [] args){
        
        OddNumbersThread t1 = new OddNumbersThread();
        OddNumbersThreadd t2 = new OddNumbersThreadd();
        
        t1.start();
        t2.start();
        
        /*
         *  Daca firul de executie nu a fost pornit sau s-a terminat treci dupa el, oricare situatie blocheaza si asteapta
         *  (join este o sincronizare intre firele de executie)
         */
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println("THE END");
    }
}