import java.io.*;
//Java 6
// public class Exemplu1{
    // public static void main(String [] args){
        // try{
            // InputStreamReader in = new InputStreamReader(System.in);
            // BufferedReader cons = new BufferedReader(in);
            
            // String line = cons.readLine();
            
            // StringBuilder sb = new StringBuilder(line);
            // sb.reverse();
            
            // System.out.println(sb);
        // }catch (IOException e){
            // e.printStackTrace();
        // }
    // }
// }

//Java 9
// public class Exemplu1{
    // public static void main(String [] args){
        
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader cons = new BufferedReader(in);
        
        // try(in, cons){
            // String line = cons.readLine();
            
            // StringBuilder sb = new StringBuilder(line);
            // sb.reverse();
            
            // System.out.println(sb);
        // }catch (IOException e){
            // e.printStackTrace();
        // }
    // }
// }

//Java 7-8
public class Exemplu1{
    public static void main(String [] args){
        try(
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(in);
        ){
            String line = cons.readLine();
            
            StringBuilder sb = new StringBuilder(line);
            sb.reverse();
            
            System.out.println(sb);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}