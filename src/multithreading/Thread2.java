package multithreading;

public class Thread2 {
    public static void main(String[] args) {
        class A{
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                int i=1;
                while(true){
                    System.out.println(i);
                }
            }
        });
    }
}
}
