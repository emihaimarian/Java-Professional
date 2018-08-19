import java.io.*;

public class Exemplu6{
    public static void main(String [] args){
        
        try(
            FileOutputStream fos = new FileOutputStream("pisica");
            ObjectOutputStream out = new ObjectOutputStream(fos)){
                
                Pisica p = new Pisica("Tom", 3);
                out.writeObject(p);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}