package ex01;

import java.util.*;

public class Exemplu1{
    public static void main(String [] args){
        
        Optional<String> o1 = Optional.empty();
        
        /*
         * Optional.of(parm nu poate sa fie null, arunca o exceptie)
         */
        Optional<String> o2 = Optional.of("Hello");
      
        /*
         * Daca am un obiect care poate fi null si din care vreau sa creez un Optional
         * trebuie sa folosesc ofNullable
         */
        Optional<String> o3 = Optional.ofNullable("Hello");
        
        String hello = "Hello";//poate fi null
        Optional<String> o4 = Optional.ofNullable(hello);
        
        System.out.println(o1.isPresent());
        System.out.println(o2.isPresent());
        
        /*
         * isPresent nu primeste param. ci returneaza true sau false si ne spune daca Optional-ul contine ceva
         * ifPresent - face ceva cu valoarea din interior daca exista aceasta valoare
         */
        o2.ifPresent(System.out::println);
        
        o2.filter(s -> s.length() % 2 == 0)
            .ifPresent(System.out::println);
        
        o2.map(s -> s.length())
            .ifPresent(System.out::println);
            
        /*
         * orElse returneaza fie valoarea din interiorul lui o2 daca aceasta exista
         */
        String v = o2.orElse("World");
        
        /*
         * Din Java9 este Deprecated!
         */
        String x = o2.get();
    }
}