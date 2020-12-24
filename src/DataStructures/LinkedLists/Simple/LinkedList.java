package DataStructures.LinkedLists.Simple;

public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList() { }

    public void add(String value) {
        Node tmp = new Node(value);

        if(first == null) {
            first = tmp;
            last = first;

            return;
        }

        last.setNext(tmp);
        last = tmp;
    }

    public void delete(String value) {
        Node tmp = first, previous = null;

        do {
            if(tmp.getValue().equalsIgnoreCase(value)) {
                if(tmp == first) {
                    first = tmp.getNext();
                }
                else {
                    previous.setNext(tmp.getNext());
                }
            }

            previous = tmp;
            tmp = tmp.getNext();
        } while(tmp != null);
    }

    public void showList() {
        Node tmp = first;

        do {
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        } while(tmp != null);
    }
}
