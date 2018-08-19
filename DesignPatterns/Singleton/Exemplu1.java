package Singleton;

public class Exemplu1{
    
    public static void main(String [] args){
    
        Pisica p1 = Pisica.getInstance();
        
        p1.nume = "TOM";
        p1.culoare = "negru";
        
        Pisica p2 = Pisica.getInstance();
        
        System.out.println(p2.nume + " " + p2.culoare);
    }
}