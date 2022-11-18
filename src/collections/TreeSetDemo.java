package collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet=new TreeSet<>();

        treeSet.add(50);
        treeSet.add(100);
        treeSet.add(150);
        treeSet.add(200);

        System.out.println(treeSet);

        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.higher(25));
        System.out.println(treeSet.lower(55));
        System.out.println(treeSet.floor(25));
        System.out.println(treeSet.contains(25));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(25,true));
        System.out.println(treeSet.tailSet(20,false));
    }
}
