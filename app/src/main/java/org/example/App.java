package org.example;

public class App {
    public static void main(String[] args) {
        QueueTees queue = new QueueTees();

        Cutie puppy = new Puppy();
        Cutie kitty = new Kitty();

        System.out.println("Initial size: " + queue.size());

        queue.enqueue(puppy);
        queue.enqueue(kitty);

        System.out.println("Size after enqueues: " + queue.size());

        Cutie first = queue.dequeue();
        System.out.println("Dequeued: " + first.description());

        Cutie second = queue.dequeue();
        System.out.println("Dequeued: " + second.description());

        System.out.println("Final size: " + queue.size());
    }
}
