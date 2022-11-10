package multithreading;

public class SynchronizedDemo {
   static int i;

    private static void increase() {
        synchronized (SynchronizedDemo.class) {
            i++;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo obj =new SynchronizedDemo();


        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1000;i++){
                    obj.increase();
                }

            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj.increase();
                }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj.increase();
                }
            }
        });
        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj.increase();
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(obj.i);


    }
}
