package multithreading;

public class AnonymousInnerClass2 {
    public static void main(String[] args) throws InterruptedException {
      Thread t1 =new Thread(()->{
          for(int i=1;i<=4;i++){
              System.out.println("hiii");

              try {
                  Thread.sleep(500);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }

          }
      });
        t1.start();

        Thread t2=new Thread(()->{
            for(int i=1;i<=4;i++){
                System.out.println("Hello");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        });

            t1.join();
            t2.start();

//        System.out.println("Exit");
    }
}
