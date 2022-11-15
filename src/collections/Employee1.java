package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee1 {

    int id;
    String name,address;


    public Employee1(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return id == employee1.id && Objects.equals(name, employee1.name) && Objects.equals(address, employee1.address);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {

        Employee1 obj1=new Employee1(1,"Amit","Satara");
        Employee1 obj2=new Employee1(1,"Amit","Satara");
        Employee1 obj3=new Employee1(2,"TEjas","Nashik");


        Set<Employee1> set1= new HashSet<>();

        set1.add(obj1);
        set1.add(obj2);
        set1.add(obj3);

        set1.forEach(Employee1->{
            System.out.println(Employee1.id+" "+Employee1.name+" "+Employee1.address);
        });



    }

}
