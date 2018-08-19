public class Exemplu2{ 
    public static void main (String [] args){
        Predicate p1 = x -> true;
  
        Predicate p2 = x -> x % 2 == 0;
        System.out.println(p2.test(10));
        System.out.println(p2.test(11));
        
        // Nu face asta
        Predicate p3 = x -> {
            System.out.println("Bau!");
            return x % 2 == 0;
        };
        
        Predicate p4 = x -> myTest(x);
        
        Predicate p5 = Exemplu2::myTest;
        
    }
    
    private static boolean myTest(int x){
        System.out.println("BAU!");
        return x % 2 == 0;
    }
}