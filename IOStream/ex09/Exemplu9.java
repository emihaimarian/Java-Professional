import java.io.*;
public class Exemplu9{
    public static void main(String [] args){
        try(
            FileInputStream fisier = new FileInputStream("c");
            ObjectInputStream in = new ObjectInputStream(fisier);
            
        ){
            C c = (C) in.readObject();
            
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}