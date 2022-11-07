package multithreading;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface myInterface = () ->
        {
            System.out.println("in show");

        };
        myInterface.show();
    }
        interface MyInterface {
            void show();
        }
    }

