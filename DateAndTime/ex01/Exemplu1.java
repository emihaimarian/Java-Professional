package ex01;

import java.time.*;

/*
 * Clase care inlocuiesc java.util.Date(legacy): 
 * 
 * LocaleDate
 * LocalTime
 * LocalDateTime
 * ZonedDateTime (ZoneId)
 * 
 * Duration
 * Period
 */

public class Exemplu1{
    public static void main(String [] args){
        
        /*
         * Clasele au constructori privati
         */
        
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.of(10, 55);
        LocalTime t3 = LocalTime.of(10, 55, 20);
        LocalTime t4 = LocalTime.of(10, 55, 30, 100);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println("==============================");
        
        LocalTime result = t1.minusMinutes(10);
        LocalTime result2 = t1.plusMinutes(10);
        
        System.out.println(result);
        System.out.println(result2);
        System.out.println("==============================");
        
        if (t1.isAfter(t2)){
            System.out.println("Hello");
        }else {
            System.out.println("World");
        }
        System.out.println("==============================");
    }
}