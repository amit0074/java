package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("Satara",10);
        map1.put("Nashik",20);
        map1.put("Pune",30);

        Map<String,Integer> map2=new HashMap<>();
        map2.put("Mumbai",40);
        map2.put("Sangli",50);
        map2.put("Kolhapur",60);

        Map<String,Integer> map3=new HashMap<>();
        map3.put("Dubai",70);
        map3.put("UK",80);
        map3.put("US",90);

        List<Map<String,Integer>> list=new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

        System.out.println(list);

//        for (Map.Entry<String,Integer>m:map1.entrySet()) {
//            System.out.println(m.getKey()+" "+m.getValue());

//            for (Map<String, Integer> stringIntegerMap : list) {
//                System.out.println(list);

            list.forEach(s->{
                s.forEach((k,v)->{
                    System.out.println(k+" "+v);
               } );

            });

            }

        }


