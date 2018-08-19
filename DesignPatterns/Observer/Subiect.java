package Observer;

import java.util.*;

public class Subiect{
    
    private List<ListenerInterface> listeners = new ArrayList();
    
    public void addListener(ListenerInterface listener){
        listeners.add(listener);
    }
    
    public void removeListener(ListenerInterface listener){
        listeners.remove(listener);
    }
    
    public void metodaCareModificaSubiectul(){
        //ce face ea
        notifyListeners();
    }
    
    private void notifyListeners(){
        listeners.forEach(ListenerInterface::subiectModificat);
    }
}