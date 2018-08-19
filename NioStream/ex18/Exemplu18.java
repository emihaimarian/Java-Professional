package ex18;

/*
 * Avand o lista de numere intregi afisati suma nr impare
 */

import java.util.*;

public class Exemplu18{
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1, 2, 5, 6, 10, 90, 100, 24);
        
        /*
         * reduce primeste o valoare initiala si operatia (regula la noi este suma numerelor) pe care o aplica intre valori
         */
            
        int suma = list.stream()
            .filter(x -> x % 2 == 1)
            .reduce(0, (a,b) -> a + b);
            
        System.out.println(suma);

    }
}