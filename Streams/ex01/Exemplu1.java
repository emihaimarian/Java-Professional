package ex01;

import java.util.stream.*;

public class Exemplu1{
    public static void main(String [] args){
        
        /*
         * Creeaza un stream gol si este utila in momentul in care vrem sa tratam un caz de exceptie intr-o metoda care ne returneaza un stream
         */
        Stream<Integer> s1 = Stream.empty();
        
        /*
         * Stream cu valori statice => Stream.of(vargs[0, infinit]);
         */
        Stream<Integer> s2 = Stream.of(3,5,6,7,8,9);
        
        /*
         * Ne creeaza un stream cu o sursa infinita
         * Prima valoare este cea de la care se incepe, iar cea de a doua este o expresie lambda care ne da regula de iterare efectiva
         * limit - operatie intermediara pentru a ne limita la un anumit numar de valori
         */
        
        Stream<Integer> s3 = Stream.iterate(1, i -> i + 2);
        s3.limit(10)
            .forEach(System.out::println);
        
        /*
         * Alta metoda pentru a genera un stream infinit
         * Generate primeste un Supplier care ii spune ce genereaza
         * (() -> 1) => contine o infinititate de valori de 1
         */
        
        Stream<Integer> s4 = Stream.generate(() -> 1);
        s4.limit(10)
            .forEach(System.out::println);
    }
}