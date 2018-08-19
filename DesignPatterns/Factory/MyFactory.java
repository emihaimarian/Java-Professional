package Factory;

/*
 * Clasa MyFactory este de fapt o implementare de Factory, astfel se foloseste o interfata astfel incat
 *  aceasta metoda CreateObject sa nu expuna tipul de MyFactory direct ci tipul interfetei respective.
 */
public abstract class MyFactory{
    
    /*
     * Defineste ca metode abstracte operatiile pe care trebuie sa le aiba acele entitati pe care le construieste.
     */
    public static enum Types{
        X, Y, Z;
    }
    
    public static MyFactory createObject(Types t){
        switch(t){
            case X:
                return new MyFactoryObject1();
            case Y:
                return new MyFactoryObject2();
            case Z:
                return new MyFactoryObject2();
            default:
                throw new IllegalArgumentException("There is no such type for this factory;");
        }
    }
    
    private static class MyFactoryObject1 extends MyFactory{
        public void m1(){
            System.out.println("Object 1 m1()");
        }
        
        public void m2(){
            System.out.println("Object 1 m2()");
        }
    }
    
        private static class MyFactoryObject2 extends MyFactory{
        public void m1(){
            System.out.println("Object 2 m1()");
        }
        
        public void m2(){
            System.out.println("Object 2 m2()");
        }
    }
    
        private static class MyFactoryObject3 extends MyFactory{
        public void m1(){
            System.out.println("Object 3 m1()");
        }
        
        public void m2(){
            System.out.println("Object 3 m2()");
        }
    }
    
    public abstract void m1();
    public abstract void m2();
}