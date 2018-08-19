public class Pisica implements java.io.Serializable{
    
    public static final long serialVersionUID = 1;
    // transient modificator de acces ptr Serializable. Marcam atributele care nu trebuie sa fie serializabile
    // transient int varsta;
    
    int varsta;
    String nume;
    String culoare;
    
    public Pisica(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }
}