package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Array list store duplicate values
//Arraylist maintain insertion order
//arraylist uses dynamic array to store the eement
//array list grow and shrink automatically by 50%

public class ArraylistDemo {

    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();

        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
//        System.out.println(list1);

//        list1.forEach(integer -> System.out.println(integer));

        List<Integer> list2=new ArrayList<>();

        list2.add(0);
        list2.add(1);
        list2.add(6);
        list2.add(7);
//        System.out.println(list2);

//        System.out.println(list1.addAll(list2));
//        System.out.println(list1.removeAll(list2));
//        System.out.println(list1.retainAll(list2));
        System.out.println(list1.remove(3));
//        System.out.println(list1.indexOf(2));
//        System.out.println(list1.contains(1));
        list1.clear();
        System.out.println(list1.isEmpty());
        System.out.println(list1);

        List<Integer> list=new ArrayList<>();
        List<Integer> list3= Arrays.asList(1020,200,300,400,69);
        List<Integer> list4=new ArrayList<>(Arrays.asList(1020,200,300,400,69));
        List<Integer> list5=new ArrayList<>(List.of(1,2,3,4));

        List<Integer> list6=new ArrayList<>(){{
            add(3);
            add(4);

        }};

        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);
        System.out.println(list6);



    }
}
