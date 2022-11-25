package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambadaExpression {
    public static void main(String[] args) {
        MyInterface m=()-> {
            System.out.println("In Lambada");

        };
        m.show();

        MyInterface1 m1=(a,b)->{
            System.out.println(a+b);
        };
      m1.add(4,4);

        List<Integer> list= Arrays.asList(1,2,3,4);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

    }
}
@FunctionalInterface
interface MyInterface{
    void show();


}
@FunctionalInterface
interface MyInterface1{
    void add(int i,int j);
}

