package DataStructures.Queues;

public class Queue {
    private Node front, rear;

    public Queue() { }

    public boolean isEmpty() {
        return front == null ? true : false;
    }

    public void enqueue(String value) {
        Node tmp = new Node(value);

        if(front == null)
            front = rear = tmp;
        else {
            rear.setNext(tmp);
            rear = tmp;
        }
    }

    public String dequeue() {
        Node tmp = front;

        front = tmp.getNext();

        return tmp.getValue();
    }

    public void showQueue() {
        Node tmp = front;

        if(tmp == null)
            return;

        do {
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        } while(tmp != null);
    }
}
