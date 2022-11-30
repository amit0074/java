package java8;

import java.util.function.Function;

/**
 * stream api= it is a sequence of object and it have many methods
 *              we combine that method and produce desire result
 *
 * types = sequencial and parallel stream(multithreading)
 *
 * operation = intermediate and terminal
 *
 * terminal = forEach(),reduce(),collect()
 *
 * intermediate = map(Function),filter(predicate),sorted()
 */

public class StreamApi {
    public static void main(String[] args) {
        Function<Integer,Integer> fun=(integer )-> integer*integer;
        System.out.println(fun.apply(9));

        Function<String,Integer> fun1=s -> s.length();
        System.out.println(fun1.apply("satara is my city"));

        }
    }



