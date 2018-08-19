package ex04;

import java.io.*;

public class Exemplu4{
    public static void main(String [] args){
        
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(isr)
        ){
            while(true){
                System.out.print("Comanda: ");
                String cmd = cons.readLine();
            
                String [] cuv = cmd.split("\\s+");
            
                switch(cuv[0]){
                    case "exit": {
                        System.out.println("Exiting ...");
                        return;
                    }
                
                    case "createfile": {
                        File file = new File(cuv[1]);
                        file.createNewFile();
                        System.out.println("A fost creat un fisier!");
                
                    } break;
                    
                    case "createdir": {
                        File file = new File(cuv[1]);
                        file.mkdir();
                        System.out.println("A fost creat un folder!");
                
                    } break;
                    
                    
                    case "delete": {
                        File file = new File(cuv[1]);
                        file.delete();
                        System.out.println("A fost sters un fisier!");
                
                    } break;
                    
                    
                    case "list": {
                        File file = new File(cuv[1]);
                        String [] fisiere = file.list();    
                        for (String n : fisiere) {
                            System.out.println(n);
                        }
                    } break;
                
                    default:
                        System.out.println("Comanda inexistenta");
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}