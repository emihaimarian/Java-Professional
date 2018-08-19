package ex04;

import java.util.*;
import java.util.stream.*;

public final class Magazin{
    
    private final String nume;
    private final List<Produs> produse;
    
    public Magazin(String nume, List<Produs> produse){
        this.nume = nume;
        this.produse = produse
            .stream()
            .map(p -> {
                Produs px = new Produs();
                px.nume = p.nume;
                px.pret = p.pret;
                return px;
            })
            .collect(Collectors.toList());
    }
    
    public String getNume(){
        return this.nume;
    }
    
    public List<Produs> getProduse(){
        return this.produse
            .stream()
            .map(p -> {
                Produs px = new Produs();
                px.nume = p.nume;
                px.pret = p.pret;
                return px;
            })
            .collect(Collectors.toList());
    }
}