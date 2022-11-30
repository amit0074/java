package java8;

import java.util.Arrays;
import java.util.List;

public class BiggestNumber {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,4,6,8);

         int max=0;

        for (int i=0;i<list.size();i++){
            if(list.get(i)>max){
               max=list.get(i);

            }
        }
        System.out.println("Max="+max);

    }
}
