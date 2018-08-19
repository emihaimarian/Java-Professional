package ex20;

import java.nio.file.*;
import java.io.*;

public class Exemplu20{
    public static void main(String [] args){
        Path p = Paths.get("./");
        
        try{
           //list-ul ia fisierele din folderul curent; list este echivalent cu walk(p, 1)
           //walk ia fisierele de pe toate nivele Files.walk(p, 10), 10 fiind adancimea
           //Files.list(p)
           Files.walk(p, 10)
                //Afiseaza fisiere care se termina in .java
                .filter(x -> x.toString().endsWith(".java"))
                //Afiseaza fisierele care au un nr par de caractere
                .filter(x -> x.getFileName().toString().length() % 2 == 0)
                .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}