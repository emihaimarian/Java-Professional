package ex15;

import java.util.*;
import java.util.stream.*;

public class Exemplu15{
    public static void main(String [] args){
        List<Pisica> list = Arrays.asList(
            new Pisica("Kitty", "negru"),
            new Pisica("Mitzy", "gri"));
        
        Map<String, String> map =
            //list.stream().collect(Collectors.toMap(p -> p.getNume(), p -> getCuloare()));
            list.stream().collect(Collectors.toMap(Pisica::getNume, Pisica::getCuloare));
        
        System.out.println(map);
    }
}