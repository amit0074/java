package java8;

public class MethodRefStatic {
    public static void main(String[] args) {

        MyInterface4 myInterface4=MethodRefStatic::display;
        myInterface4.show();

    }

    public static void display(){
        System.out.println("In display");
    }
}

interface MyInterface4{
    void show();
}
