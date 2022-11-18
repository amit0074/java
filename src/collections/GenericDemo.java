package collections;

import java.util.List;

public class GenericDemo <T>{

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        GenericDemo<String> str=new GenericDemo<>();
        str.setT("Amit");
        System.out.println(str.getT());

        GenericDemo<Integer> str1=new GenericDemo<>();
        str1.setT(5);
        System.out.println(str1.getT());

        GenericDemo<Double> str3=new GenericDemo<>();
        str3.setT(0.5);
        System.out.println(str3.getT());

        List list= (List) new ArrayLists<>();

        list.add("Amit");
        list.add(5);







    }
}
