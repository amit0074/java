//package collections;
//
//import java.util.*;
//
//public class Student {
//
//    int id;
//    String name;
//    String address;
//
//    public Student(int id,String name,String address) {
//        this.id = id;
//        this.name=name;
//        this.address=address;
//    }
//
//    public static void main(String[] args) {
//
//            Student obj1=new Student(1 ,"Amit","Satara");
//            Student obj2=new Student(2 ,"Tejas","Nashik");
//            Student obj3=new Student(3 ,"Manish","Dubai");
//
//            List<Student> list=new ArrayList<Student>();
//            list.add(obj1);
//            list.add(obj2);
//            list.add(obj3);
//
//            Iterator itr=list.iterator();
//
//            while(itr.hasNext()){
//                Student st=(Student) itr.next();
//                System.out.println(st.id+" "+st.name+" "+st.address);
//            }
//
//
//
//
//
//
//
//
//    }
//}
