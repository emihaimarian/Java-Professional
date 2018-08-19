package SingletonML;

/*
 * Avantaje: sincronizare la primul apel
 * Dezavantaje: daca constructor clasei arunca o exceptie checked nu pot folosi aceasta modalitate si revin la metoda din Pisica
 */
public class Pisica2{
   
    String nume;
    String culoare;
    
    private Pisica2(){}
    
    private static final class SingletonHolder{
        private static final Pisica2 SINGLETON = new Pisica2();
    }
    
    public static Pisica2 getInstance(){
        return SingletonHolder.SINGLETON;
    }
}