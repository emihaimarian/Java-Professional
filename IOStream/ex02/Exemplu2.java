import java.io.*;

//Citire fisier

public class Exemplu2{
    public static void main(String [] args){
        
        try(
            FileInputStream fisier = new FileInputStream("Exemplu2.java");
            InputStreamReader isr = new InputStreamReader(fisier);
            BufferedReader in = new BufferedReader(isr)){
                
                String line;
                while( (line = in.readLine()) != null) {
                    System.out.println(line);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}