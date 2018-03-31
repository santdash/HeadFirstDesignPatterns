package sant.practice.collection.map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Qu1");
        System.out.println(queue.poll());
        System.out.println(queue);

        Queue<String> lQueue = new LinkedBlockingQueue<>();
        lQueue.offer("Hi");
        lQueue.offer("Hello");
        System.out.println(lQueue.poll() + " " + lQueue);

    }

}
