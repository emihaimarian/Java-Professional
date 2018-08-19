package Registry;

public class Exemplu1{
    public static void main(String [] args){
        
        Produs p1 = Produs.getInstance(Produs.ProdusType.DULCE);
        Produs p2 = Produs.getInstance(Produs.ProdusType.DULCE);
        Produs p3 = Produs.getInstance(Produs.ProdusType.CU_ALCOOL);
        
        /*
         * o sa dea null ptr ca nu am dat o valoare, ideea este ca instanta p2 va fi aceiasi cu p1
         */
        p1.nume = "biscuiti";
        
        System.out.println(p1.nume + " " + p2.nume + " " + p3.nume);
    }
}