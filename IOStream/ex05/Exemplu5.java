import java.io.*;

public class Exemplu5{
    public static void main(String [] args){
        try(
            InputStreamReader isr1 = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(isr1)
        ){
            System.out.print("File:");
            String file = cons.readLine();
            
            try(
                FileInputStream fisier = new FileInputStream(file);
                InputStreamReader reader = new InputStreamReader(fisier);
                BufferedReader in = new BufferedReader(reader)
            ){
                int suma = 0;
                String line;
                
                while ((line = in.readLine()) != null) {
                    suma += Integer.parseInt(line);
                }
                System.out.println("Suma:" + suma);
            }
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}