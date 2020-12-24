package DataStructures.Queues;

public class QueueTest {

    public static void main(String[] args) {
        queueTest();
    }

    public static void queueTest() {
        Queue queue = new Queue();
        queue.enqueue("Hello");
        queue.enqueue("World");
        queue.enqueue("!!!");

        queue.showQueue();

        queue.dequeue();
        queue.dequeue();

        queue.showQueue();

        queue.dequeue();

        System.out.println("Is empty? "+queue.isEmpty());
    }
}
