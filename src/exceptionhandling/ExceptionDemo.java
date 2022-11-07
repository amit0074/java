package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {

        int i=10;
        int j=1000002220;
        double k=0.0;
        try{
            k=(double)i/j;
        } catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println(k);

        System.out.println("hiee");
    }
}
