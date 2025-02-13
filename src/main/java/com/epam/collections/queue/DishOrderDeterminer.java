package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> output = new ArrayList<>();

        for(int i=0; i<numberOfDishes; i++) {
            deque.addLast(i+1);
        }
        while(!deque.isEmpty()) {
            for(int i=0; i<everyDishNumberToEat-1; i++) {
                int a = deque.pollFirst();
                deque.addLast(a);
            }
            output.add(deque.pollFirst());
        }
        return output;
    }
}
