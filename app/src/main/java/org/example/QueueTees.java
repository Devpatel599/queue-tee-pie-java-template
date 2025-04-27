package org.example;

public class QueueTees {
    private static final int MAX_SIZE = 10;
    private Cutie[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueTees() {
        queue = new Cutie[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Cutie c) {
        if (size >= MAX_SIZE) {
            System.out.println("Queue is full! Cannot enqueue: " + c.description());
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = c;
        size++;
    }

    public Cutie dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        Cutie c = queue[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return c;
    }

    public int size() {
        return size;
    }

    // (Optional) One-credit Add-on
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }
}
