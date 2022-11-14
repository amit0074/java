package collections;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        stack.add(60);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.add(3,45);
        stack.push(55);
        System.out.println(stack.empty());
        System.out.println(stack.search(50));
        System.out.println(stack);


    }
}
