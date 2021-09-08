package com.company;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> newQueue;
        newQueue = new LinkedList<>();

        newQueue.add(1);
        newQueue.add(2);
        newQueue.add(3);
        newQueue.add(4);
        newQueue.add(5);

        System.out.println("NewQueue : " + newQueue);

        Integer name = newQueue.remove();
        System.out.println("Removed from NewQueue : " + name + " | New NewQueue : " + newQueue);

        name = newQueue.poll();
        System.out.println("Removed from NewQueue : " + name + " | New NewQueue : " + newQueue);
    }
}
