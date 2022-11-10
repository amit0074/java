package multithreading;

public class DeadLock {
    public static void main(String[] args) {
        String resource1="Printer";
        String resource2="Scanner";

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println(Thread.currentThread().getName()+" locked "+resource1);
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println(Thread.currentThread().getName()+" locked "+resource2);
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });
        t1.setName("laptop");
        t2.setName("Desktop");

        t1.start();
        t2.start();
    }
}
