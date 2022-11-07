package multithreading;



public class ProducerConsumer2 {

    int num;

    public void getNum() {
        System.out.println("Get:"+this.num);
    }

    public void setNum(int num) {
        this.num = num;
        System.out.println("Set:"+this.num);
    }
}


        class Producer implements Runnable{
    ProducerConsumer2 producerConsumer2;

    public Producer(ProducerConsumer2 producerConsumer2){
        this.producerConsumer2=producerConsumer2;
        Thread t1=new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            producerConsumer2.setNum(i++);
            try{
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
    ProducerConsumer2 producerConsumer2;

    public Consumer(ProducerConsumer2 producerConsumer2) {
        this.producerConsumer2=producerConsumer2;
        Thread t2=new Thread(this);
        t2.start();
    }

    @Override
    public void run() {
        while (true){
            producerConsumer2.getNum();
            try{
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Main2{
    public static void main(String[] args) {
        ProducerConsumer2 producerConsumer2=new ProducerConsumer2();
        Producer producer=new Producer(producerConsumer2);
        Consumer consumer=new Consumer(producerConsumer2);

    }
}

