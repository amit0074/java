package exceptionhandling;

public class Throwkeyword {
    public static void main(String[] args) throws Exception {
        int age=19;

        if (age>18){
            System.out.println("You Can Vote");
        }
        else{
            throw new Exception("You Can Not Vote");
        }
    }
}


/**
 *              throw                                                                       throws
 *
 * 1. to throw the exception explicitly                                     1. to declare exception
 *
 * 2. throw is used in method                                               2. throws is used with method signature
 *
 * 3. throw is followed by instance                                         3. throws is followed by classes
 *
 * 4. you can throw only single exception                                   4. you can declare multiple exception
 */
