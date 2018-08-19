package ex03;

/*
 * Media aritmetica a lungimii sirurilor(map())
 * Clasa Stream ---> object stream
 * Streamuri primitive: IntStream, Long Stream, DoubleStream
 * 
 * x --> map() --> 2*x
 * s --> map() --> s.lenght()
 * (Stream) s --> map() --> (IntStream) s.length()
 * 
 * Exista urmatoarele map() => mapToInt(), mapToDouble(), mapToLong(), mapToObj();
 * 
 * Steram -> map()          => Steram
 * Stream -> mapToInt()     => IntStream
 * Stream -> mapToDouble()  => DoubleStream
 * Stream -> mapToLong()    => LongStream
 * 
 * IntStream -> map()           => IntStream
 * IntStream -> mapToLong()     => LongStream
 * IntStream -> mapToDouble()   => DoubleStream
 * IntStream -> mapToObj()      => Stream
 * 
 * LongStream -> map()          => LongStream
 * LongStream -> mapToInt()     => IntStream
 * LongStream -> mapToDouble()  => DoubleStream
 * LongStream -> mapToObj()     => Stream
 * 
 * DoubleStream -> map()        => DoubleStream
 * DoubleStream -> mapToInt()   => IntStream
 * DoubleStream -> mapToLong()  => DoubleStream
 * DoubleStream -> mapToObj()   => Stream
 */

import java.util.*;

public class Exemplu3{
    public static void main(String [] args){
        
        List<String> list = Arrays.asList("AAA", "BBBBBBB", "CCC", "DDDDDDDD");
        
        /* int sum = 
            list.stream()
                .map(s -> s.length())
                .reduce(0, (a,b) -> a + b);
            
        System.out.println(((double)sum) / list.size());
        */
        
        double av = 
            list.stream()
                .mapToInt(s -> s.length())
                .average().getAsDouble();
        System.out.println(av);    
    }
}