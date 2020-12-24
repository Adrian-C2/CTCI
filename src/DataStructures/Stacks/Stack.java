package DataStructures.Stacks;

public class Stack {
    private Node top;

    public Stack() { }

    public boolean isEmpty() {
        return top == null ? true : false;
    }

    public String peek() {
        return top.getValue();
    }

    public void push(String value) {
        Node newValue = new Node(value);
        newValue.setNext(top);
        top =  newValue;
    }

    public String pop() {
        Node value = top;

        if(top == null)
            return "";

        top = value.getNext();

        return value.getValue();
    }

    public void showStack() {
        Node tmp = top;

        if(top == null)
            return;

        do {
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        } while(tmp != null);
    }
}
