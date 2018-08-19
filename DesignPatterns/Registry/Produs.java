package Registry;

import java.util.*;

public class Produs{
    
    public static enum ProdusType{
        DULCE, ACRISOR, CU_ALCOOL
    }
    
    private static HashMap<ProdusType, Produs> registry = new HashMap<>();
    
    public static Produs getInstance(ProdusType type){
        if(!registry.containsKey(type)){
            registry.put(type, new Produs());
        }
        return registry.get(type);
    }
}