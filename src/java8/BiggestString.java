package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BiggestString {
    public static void main(String[] args) {

        List<String> str=new ArrayList<>();
        str.add("Amit");
        str.add("Tejas");
        str.add("Manish");
        str.add("Jeevann");


        System.out.println(str);
        String longestString=str.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestString);

    }
}
