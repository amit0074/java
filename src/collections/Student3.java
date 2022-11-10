package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student3 {
    int id;
    String name;
    String address;

    public Student3(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        Student3 obj1 = new Student3(1, "Amit", "Satara");
        Student3 obj2 = new Student3(2, "Tejas", "Nashik");
        Student3 obj3 = new Student3(3, "Manish", "Dubai");

        List<Student3> list1 = new ArrayList<Student3>();
       list1.add(obj1);
       list1.add(obj2);
       list1.add(obj3);

        Iterator itr = list1.iterator();

        while (itr.hasNext()) {
            Student3 st = (Student3) itr.next();
            System.out.println(st.id + " " + st.name + " " + st.address);
        }
    }
}
