package Observer;

public class Exemplu2{
    
    public static void main(String [] args){
        
        Subiect s = new Subiect();
        
        ListenerInterface e1 = new ListenerImpl();
        ListenerInterface e2 = new ListenerImpl();
        ListenerInterface e3 = new ListenerImpl();
        
        s.addListener(e1);
        s.addListener(e2);
        s.addListener(e3);
        
        s.metodaCareModificaSubiectul();
    }
}