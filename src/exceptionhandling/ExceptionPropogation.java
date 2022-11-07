package exceptionhandling;

public class ExceptionPropogation {
    public void a(){
        int i=10/0;

    }
    public void b(){
        try{
            this.a();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void c(){
        this.b();
    }

    public static void main(String[] args) {
      ExceptionPropogation obj=new ExceptionPropogation();
      obj.c();
    }
}
