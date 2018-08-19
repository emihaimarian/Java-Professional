import java.io.*;
import java.util.*;

public class Exemplu4{
    public static void main(String [] args){
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr)
        ){
            System.out.print("Nr:");
            int nr = Integer.parseInt(in.readLine());
            
            System.out.println("File:");
            String file = in.readLine();
            
            Random r = new Random();
            
            try(PrintStream out = new PrintStream(file)){
                for (int i = 0; i < nr; i++){
                    out.println(r.nextInt(1000));
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}