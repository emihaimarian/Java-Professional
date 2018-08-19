package ex16;

import java.util.*;
import java.nio.file.*;
import java.io.*;
    /*
     * Face exact ce face si Exemplu15
     * Citeste toate liniile si le pune intr-o lista 
     * Il folosesti in cazul in care fisiere au putine linii, daca citesti fisiere foarte mari cauzeaza un OutOfMemoryException
     * Daca strangi stringurile intr-o lista ele nu vor fi colectate de GC pentru ca sunt puse intr-o lista si au referinta
     * Neputand sa fie eliberate ele vor umple memoria si vor fi pastrate in memorie
     * 
     * readAllBytes(Path Path) se foloseste ca sa citesc sub forma de bytes un fisier 
     * Si ma ajuta sa citesc un fisier in intregime pe care vreau sa il procesez intr-un fel sau altul (exemplu: procesarea unei imagini);
     */

public class Exemplu16{
    public static void main(String [] args){
        
        Path p1 = Paths.get("Exemplu16.java");
        
        try{
            List<String> lines = Files.readAllLines(p1);
            lines.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}