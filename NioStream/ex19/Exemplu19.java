package ex19;

import java.nio.file.*;
import java.io.*;

public class Exemplu19{
    public static void main(String [] args){
        Path p = Paths.get("Exemplu19.java");
        
        try{
            Files.lines(p)
                //filtrul sterge liniile goale
                .filter(s -> !s.trim().isEmpty())
                //filterul afiseaza doar liniile pare din Exemplu19.java
                .filter (s -> s.length() % 2 == 0)
                //Afiseaza de la stanga la dreapta
                .map(s -> new StringBuilder(s).reverse())
                .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }       
    }
}