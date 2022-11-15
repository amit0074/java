package collections;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {

        Deque<Integer> deque=new java.util.ArrayDeque<>();
        deque.add(10);
        deque.offer(20);
        deque.addFirst(30);
        deque.addLast(60);

        System.out.println(deque);
//        System.out.println(deque.peek());
//        System.out.println(deque.pop());
//        System.out.println(deque.peekFirst());
//        System.out.println(deque.poll());
//        System.out.println(deque.pollFirst());
//        System.out.println(deque.pollLast());
//        System.out.println(deque.remove());
//        System.out.println(deque.removeFirst());

    }
}
