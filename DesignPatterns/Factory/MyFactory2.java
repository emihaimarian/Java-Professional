package Factory;

public abstract class MyFactory2 implements MyFactoryInterface{
    
    public static enum Types{
        X, Y, Z;
    }
    
    public static MyFactoryInterface createObject(Types t){
        switch(t){
            case X:
                return new MyFactory2Object1();
            case Y:
                return new MyFactory2Object2();
            case Z:
                return new MyFactory2Object2();
            default:
                throw new IllegalArgumentException("There is no such type for this factory;");
        }
    }
    
    private static class MyFactory2Object1 extends MyFactory2{
        public void m1(){
            System.out.println("Object 1 m1()");
        }
        
        public void m2(){
            System.out.println("Object 1 m2()");
        }
    }
    
        private static class MyFactory2Object2 extends MyFactory2{
        public void m1(){
            System.out.println("Object 2 m1()");
        }
        
        public void m2(){
            System.out.println("Object 2 m2()");
        }
    }
    
        private static class MyFactory2Object3 extends MyFactory2{
        public void m1(){
            System.out.println("Object 3 m1()");
        }
        
        public void m2(){
            System.out.println("Object 3 m2()");
        }
    }
}
