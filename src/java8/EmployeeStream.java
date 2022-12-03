package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeStream {
    int id;
    String name;
    double salary;

    public EmployeeStream(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;



    }

    @Override
    public String toString() {
        return "EmployeeStream{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    public double getSalary() {
        return salary;
    }



    public static void main(String[] args) {


        List<EmployeeStream> list=new ArrayList<>();

        list.add(new EmployeeStream(1,"Amit",25000));
        list.add(new EmployeeStream(2,"Tejas",30000));
        list.add(new EmployeeStream(3,"manish",55000));
        list.add(new EmployeeStream(4,"Jeevan",45000));

//        Predicate<Integer> predicate1=(p)->p>30000;

     list.stream().filter(EmployeeStream->EmployeeStream.salary>30000).forEach(System.out::println);



    }
}
