package ex02;

import java.io.*;

public class Exemplu2{
    public static void main(String [] args){
        File file = new File("A/x.txt");
        
        try{
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}