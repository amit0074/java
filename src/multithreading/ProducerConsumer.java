package multithreading;

public class ProducerConsumer {
    int i;

    boolean flag = true;
    public synchronized void setI(int i){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Set :"+i);
        this.i = i;
        flag = false;
        notify();
    }

    public synchronized void getI(){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get :"+i);
        flag = true;
        notify();
    }
}

class Main{
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread t1 = new Thread(()->{
            int i=0;
            while (true) {
                producerConsumer.setI(i++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(()->{

            while (true){
                producerConsumer.getI();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
