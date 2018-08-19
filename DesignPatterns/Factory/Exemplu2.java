package Factory;

public class Exemplu2{
    public static void main(String [] args){
        
        MyFactoryInterface f1 = MyFactory2.createObject(MyFactory2.Types.X);
        f1.m1();
        
        MyFactoryInterface f2 = MyFactory2.createObject(MyFactory2.Types.Y);
        f2.m1();
        
        
    } 
}