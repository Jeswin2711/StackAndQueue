package com.queue;

public class QueueMain
{
    public static void main(String[] args) {

        /*
        Adding Elements to a Queue
         */
        QueueOperations queue = new QueueOperations();
        queue.append(56);
        queue.append(30);
        queue.append(70);
        queue.printData();
        Object value = queue.deQueue();
        System.out.println("Dequeued Value " +  value);

    }
}
