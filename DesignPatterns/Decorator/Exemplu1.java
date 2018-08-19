package Decorator;

public class Exemplu1{
    public static void main(String [] args){
        
        Decorat d1 = new ObiectDecorat();
        Decorat d2 = new ObiectDecorator(new ObiectDecorat());
    }
}