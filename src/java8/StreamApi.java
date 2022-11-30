package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

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
//        System.out.println(fun.apply(9));

        Function<String,Integer> fun1=s -> s.length();
//        System.out.println(fun1.apply("satara is my city"));


        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        System.out.println(IntStream.of(1,2,3,4,5,6,7).max().getAsInt());
        System.out.println(Arrays.toString(IntStream.range(1,101).toArray()));
        System.out.println(IntStream.range(1,11).sum());

        Predicate<Integer> max=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>4;
            }
        };
        list.stream().filter(max).forEach(System.out::println);
        }
    }



