package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> output = new ArrayDeque<>();
        output.add(firstQueue.poll());
        output.add(firstQueue.poll());
        output.add(secondQueue.poll());
        output.add(secondQueue.poll());
        while (!firstQueue.isEmpty()) {
            firstQueue.add(output.pollLast());
            output.add(firstQueue.poll());
            output.add(firstQueue.poll());

            secondQueue.add(output.pollLast());
            output.add(secondQueue.poll());
            output.add(secondQueue.poll());
        }
        return output;
    }
}
