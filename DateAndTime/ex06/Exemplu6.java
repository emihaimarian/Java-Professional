package ex06;

import java.time.*;

public class Exemplu6{
    public static void main(String [] args){
        
        Duration d = Duration.ofMinutes(10);
        Period p = Period.ofYears(5);
        
        System.out.println(d);
        System.out.println(p);
    }
}