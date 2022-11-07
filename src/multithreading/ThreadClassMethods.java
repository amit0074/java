package multithreading;

public class ThreadClassMethods {

    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in t1");
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in t2");
            }
        });

        t2.setPriority(10);
        t1.setPriority(1);
        t1.start();
        t2.start();


    }
}
