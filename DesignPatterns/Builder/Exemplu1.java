package Builder;

public class Exemplu1{
    
    public static void main(String [] args){
        ObiectulMeu o = 
            new ObiectulMeu.Builder()
            .setX(10)
            .setY(20)
            .setZ(30)
            .setW(40)
            .setQ(50)
            .setK(60)
            .build();
    }
}