import java.util.*;

public class Exemplu2{
    public static void main(String [] args){
        Locale loc = new Locale("ro", "RO");
        //Locale loc = new Locale("it", "IT");
        
        ResourceBundle bundle = ResourceBundle.getBundle("exemplu", loc);
        
        String hello = bundle.getString("txtHello");
        
        System.out.println(hello);
    }
}