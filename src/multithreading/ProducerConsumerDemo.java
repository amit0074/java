package multithreading;

public class ProducerConsumerDemo {

    int num;

    public void setNum(int num) {
        this.num = num;
        System.out.println("Set:"+this.num);
    }

    public void getNum() {
     this.num=num;
        System.out.println("Get:"+this.num);
    }
}

class Main4 {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer=new ProducerConsumer();

        Thread t1=new Thread(()->{
            int i=0;
            while(true){
                producerConsumer.setI(i++);
                producerConsumer.getI();


                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }


        });
        t1.start();
    }
}
