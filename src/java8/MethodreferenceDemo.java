package java8;

public class MethodreferenceDemo {
    public static void main(String[] args) {
        MethodreferenceDemo obj=new MethodreferenceDemo();
        MyInterface3 myInterface3=obj::display;
        myInterface3.show();

    }

    public void display(){
        System.out.println("In Display 1");
    }
}
@FunctionalInterface
interface MyInterface3{
    void show();
}
