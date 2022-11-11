package collections;

import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageInputStreamImpl;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    int eid,cno;
    String name,address;

    public Employee(int eid, int cno, String name , String address){
        this.eid=eid;
        this.cno=cno;
        this.name=name;
        this.address=address;





    }

    public static void main(String[] args) {


        Employee obj1=new Employee(1,12344,"Amit","Satara");
        Employee obj2=new Employee(2,246546,"Manish","Pune");
        Employee obj3=new Employee(3,5552552,"Tejas","Nashik");
        Employee obj4=new Employee(4,54555,"Jeevan","KOlhapur");

        List<Employee> list1=new ArrayList<>();
        list1.add(obj1);
        list1.add(obj2);
        list1.add(obj3);
        list1.add(obj4);

        list1.forEach(Employee->{
            System.out.println(Employee.eid+" "+Employee.name+" "+Employee.address+" "+Employee.cno);
        });

        }
    }




