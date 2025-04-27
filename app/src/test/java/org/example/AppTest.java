package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testEnqueueDequeue() {
        QueueTees queue = new QueueTees();
        Cutie puppy = new Puppy();
        Cutie kitty = new Kitty();

        queue.enqueue(puppy);
        queue.enqueue(kitty);

        assertEquals(2, queue.size());
        assertEquals("A little puppy with big, sad eyes", queue.dequeue().description());
        assertEquals("A playful kitty that purrs non-stop", queue.dequeue().description());
        assertEquals(0, queue.size());
    }

    @Test
    public void testQueueOverflow() {
        QueueTees queue = new QueueTees();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(new Kitty());
        }
        assertEquals(10, queue.size());
        queue.enqueue(new Puppy()); 
        assertEquals(10, queue.size());
    }

    @Test
    public void testClear() {
        QueueTees queue = new QueueTees();
        queue.enqueue(new Puppy());
        assertEquals(1, queue.size());
        queue.clear();
        assertEquals(0, queue.size());
    }
}
