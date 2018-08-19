package ex21;

import java.nio.file.*;
import java.io.*;

public class Exemplu21{
    public static void main(String [] args){
        Path p = Paths.get("./");
        
        try {
            Files.find(p, 10, (x, b) ->  b.size() > 1000)
                .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}