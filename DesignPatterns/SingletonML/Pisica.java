package SingletonML;

public class Pisica{
    
    private static Pisica SINGLETON = null;
    
    String nume;
    String culoare;
    
    private Pisica(){
    }
    
    public static Pisica getInstance(){
        if (SINGLETON == null){
            synchronized(Pisica.class){
                if (SINGLETON == null){
                    SINGLETON = new Pisica();
                }
            }
        }
        return SINGLETON;
    }
}