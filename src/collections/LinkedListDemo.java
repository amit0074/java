package collections;

//LinkedList store diplicate value
//LinkedList maintain insertion order
//LinkedLIst uses doubly linked to store the element

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> list =new LinkedList<>();
        list.add(0);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);

        list.remove(2);
        System.out.println(list);

        List<String> list1=new LinkedList<>();
        list1.add("Tejas");
        list1.add("is");
        list1.add("King");
        list1.remove(1);

        System.out.println(list1);

    }


}
