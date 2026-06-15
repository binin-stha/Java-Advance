package generics.intermediate.Question5;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueManager<T> {
    private Queue<T> queue;
    private String queueName;

    public QueueManager(String queueName) {
        queue = new LinkedList<>();
        this.queueName = queueName;
    }

    public void enqueue(T item) {
        queue.offer(item);
    }

    public T dequeue() {
        return queue.poll();
    }

    public void displayQueue() {
        int count = 1;
        System.out.println(queueName + " Queue");
        for (T item: queue) {
            System.out.println(count + ". " + item);
        }
    }

}
