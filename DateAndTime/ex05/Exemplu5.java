package ex05;

import java.time.*;

public class Exemplu5{
    public static void main(String [] args){
        
        ZonedDateTime zdt1 = ZonedDateTime.now();
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Europe/London"));
        
        System.out.println(zdt1);
        System.out.println(zdt2);
        
        ZonedDateTime zdt3 = zdt1.plusHours(17);
        ZonedDateTime zdt4 = zdt1.plusHours(16);
        
        System.out.println(zdt3);
        System.out.println(zdt4);
    }
}