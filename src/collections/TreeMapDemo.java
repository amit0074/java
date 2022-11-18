package collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,Integer> treemap=new TreeMap<>();

        treemap.put(1,10);
        treemap.put(2,20);
        treemap.put(3,30);
        treemap.put(4,40);
        treemap.put(5,50);
        treemap.put(6,60);

        System.out.println(treemap);
        System.out.println(treemap.entrySet());
        System.out.println(treemap.descendingKeySet());
        System.out.println(treemap.lastEntry());
        System.out.println(treemap.ceilingKey(2));
        System.out.println(treemap.headMap(3));
        System.out.println(treemap.subMap(1,true,4,true));
//        System.out.println(treemap);
    }
}
