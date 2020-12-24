package DataStructures.LinkedLists.Double;

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

        tmp.setPrevious(last);
        last.setNext(tmp);
        last = tmp;
    }

    public void delete(String value) {
        Node tmp = first;

        do {
            if(tmp.getValue().equalsIgnoreCase(value)) {
                if(tmp == first) {
                    first = tmp.getNext();
                }
                else {
                    tmp.getPrevious().setNext(tmp.getNext());
                }
            }

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
