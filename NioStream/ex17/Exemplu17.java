package ex17;

/*
 * Avand o lista de siruri de caractere afisati dublul valorilor lungimilor sirurilor cu numar par de caractere
 */
import java.util.*;

public class Exemplu17{
    public static void main(String [] args){
        List<String> list = Arrays.asList("HELLO", "JOHN");
        
        list.stream()
            .filter(s -> s.length() % 2 == 0)
            .map(s -> s.length() * 2)
            .forEach(System.out::println);
    }
}