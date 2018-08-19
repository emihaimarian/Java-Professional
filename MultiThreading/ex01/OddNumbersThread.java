package ex01;
import java.util.stream.*;

public class OddNumbersThread extends Thread{
    
    /*
     * Pentru a executa un fir de executie suprascriem metoda run (nu confundati metoda run cu metoda start).
     * pe run o suprascriem ca sa ii spunem ce face acel fir de executie (care sunt instr lui).
     * pe start o apelam din firul de executie ca sa ii spunem porneste acum.
     */
    @Override
    public void run(){
        Stream.iterate(1, i -> i + 2)
            .limit(50)
            .forEach(System.out::println);
    }
}