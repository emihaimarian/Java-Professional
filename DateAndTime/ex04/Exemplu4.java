package ex04;

import java.time.*;

public class Exemplu4{
    public static void main (String [] args){
    
        /*
         * Afiseaza toate ZoneId-urile
         */
        
        /* ZoneId.getAvailableZoneIds()
            .forEach(System.out::println);
        */
       
       /* 
        * ZoneId Europa 
        */
        ZoneId.getAvailableZoneIds()
            .stream()
            .filter(z -> z.contains("Europe"))
            .forEach(System.out::println);
    }
}