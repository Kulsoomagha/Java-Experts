package day9com.blit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueIntro {
    public static void main(String[] args) {
//        Queue:
//        FIFO = FIRST IN FIRST OUT
//        add -> offer

//      PRIORITY QUEUE : ONLY FROM ONE END YOU CAN REMOVE
        Queue <Integer> queue1 = new PriorityQueue<>();
        queue1.offer(12);
        queue1.offer(24);
        queue1.offer(36);

        System.out.println(queue1);
//      peek -> preview of who is in line first
        System.out.println(queue1.peek());
//      poll -> remove the first in line
        queue1.poll();
        System.out.println(queue1);

//      DOUBLE ENDED QUEUE : YOU CAN REMOVE AND ADD FROM BOTH ENDS

        Deque <Integer> queue2 = new ArrayDeque<>();
        queue2.offer(20);
        queue2.offer(35);
        queue2.offer(42);
        queue2.offer(75);

        System.out.println(queue2);
        System.out.println(queue2.peek());
        System.out.println(queue2.peekLast());

//        queue2.removeLast();
//        queue2.removeFirst();
//        queue2.offerFirst();
//        queue2.offerLast();



    }
}
