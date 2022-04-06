package com.quiz;

import java.util.LinkedList;

public class ProducerConsumerProblem {
    private static final LinkedList<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Thread producerThread = new Thread(() -> {
            int i = 0;
            while(i < 50){
                System.out.println("Producing item: " + i);
                synchronized (queue){
                    queue.addLast(i++);
                    queue.notify();  //notify will work as we have only one consumer
                }
            }

            System.out.println("Production Complete...");
        });

        Thread consumerThread = new Thread(() -> {
            synchronized (queue){
                while(true){
                    if(queue.isEmpty()){
                        try {
                            System.out.println("Entering into wait state...");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("Consuming item: " + queue.removeFirst());
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
