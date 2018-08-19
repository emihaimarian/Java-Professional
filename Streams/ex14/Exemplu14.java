package ex14;

/*
 * Avand o lista de produse pentru care numele sunt unice, transformati aceasta lista intr-un map in care numele este value si pretul este key
 */

import java.util.*;
import java.util.stream.*;

public class Exemplu14{
    public static void main(String [] args){
        
        List<Produs> produse = Arrays.asList(
            new Produs("Ciocolata", 10),
            new Produs("Bere", 5));
            
        Map<String, Integer> map =
            produse.stream().collect(Collectors.toMap(p -> p.nume, p -> p.pret));
            
        System.out.println(map);  
    }
}