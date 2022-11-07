package exceptionhandling;

public class MethodOverridingException {
    public void display(){
        System.out.println("in Display");
    }

    public static void main(String[] args) {

    }
}

class MethodOverriding extends MethodOverridingException{
    @Override
    public void display() {
        System.out.println("in display methodoverriding");
    }
}

/**
 * 1. If parent class declares no exception then you can declare only unchecked exception
 * 2. If parent class declares exception then you can declare same exception
 * 3. If parent class declare exception then you can declare child exception


 */
