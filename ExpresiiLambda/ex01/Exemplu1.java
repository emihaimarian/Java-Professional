public class Exemplu1{
    public static void main(String [] args){
        Consumer c1 = new MyConsumer();
        c1.consuma(1);
        
        Consumer c2 = new Consumer(){
            @Override
            public void consuma(int x){
                System.out.println("X:" + " " + x);
            }
        };
        c2.consuma(2);
               
        Consumer c3 = x -> System.out.println("X:" + " " + x);
        c3.consuma(3);
        
        Consumer c4 = (x) -> System.out.println("X:" + " " + x);
        c4.consuma(4);
        
        Consumer c5 = (int x) -> System.out.println("X:" + " " + x);
        c5.consuma(5);
        
        Consumer c6 = System.out::println;
        c6.consuma(6);
        
        
    }
}