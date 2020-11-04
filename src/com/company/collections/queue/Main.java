package com.company.collections.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
//        FIFO - first in, first out (первый зашел, первый вышел)
//        LIFO - last in, first out (последний зашел, первый вышел)

//        () <- A, B, C, D ...
//        (A) <- B, C, D...
//        (A, B) <- C, D...
//
//        () <- A, B, C, D
//        (D) <- A, B, C
//        (D, C) <- A, B
//        Queue <- FIFO или редко LIFO
//        Deque <- FIFO + LIFO

//      () <- A, B, C, D
//      (A) <-  B, C, D
//      (A, D) <- B, C


        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(1);
        queue.offer(10);
        queue.offer(8);
        queue.offer(7);

//        for (int i = 0; i < queue.size(); i++) {
//            // 0 -> [A B C D E]
//            // 1 -> [A B C D E]
//            System.out.println(queue.element());
//        }

//        for (int i = 0; i <= queue.size(); i++) {
//            // 0 -> [A B C D E] -> A
//            // 1 -> [B C D E] -> B
//            // 2 -> [C D E] -> C
//            // 3 -> [D E] -> i = 3, queue.size() = 2 -> if(3 < 2) -> false
//            System.out.println(queue.remove());
//        }

//        while (queue.size() > 0) {
//            System.out.println(queue.remove());
//        }

        System.out.println(queue);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next() + 10;
            System.out.println(num);
        }
        System.out.println(queue.size());

    }
}
