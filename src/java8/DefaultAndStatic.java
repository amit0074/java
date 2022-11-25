package java8;

interface MyInterface2{
    void show();

    default void display(){
        System.out.println("In Display");
    }
    static void test(){
        System.out.println("In test");
    }
}


public class DefaultAndStatic implements MyInterface2 {
    public static void main(String[] args) {

        DefaultAndStatic obj=new DefaultAndStatic();
        obj.show();
        obj.display();

        MyInterface2.test();

    }

    @Override
    public void show() {
        System.out.println("In show");
    }
}
