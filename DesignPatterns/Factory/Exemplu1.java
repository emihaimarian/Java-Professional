package Factory;

public class Exemplu1{
    public static void main(String [] args){
        
        MyFactory f1 = MyFactory.createObject(MyFactory.Types.X);
        f1.m1();
        
        MyFactory f2 = MyFactory.createObject(MyFactory.Types.Y);
        f2.m1();
        
        
    } 
}