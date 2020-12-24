package DataStructures.LinkedLists;

import DataStructures.LinkedLists.Simple.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
//        simpleLinkedListTest();
        doubleLinkedListTest();
    }

    public static void simpleLinkedListTest() {
        LinkedList list = new LinkedList();

        list.add("Hello");
        list.add("World");
        list.add("!!!");

        list.showList();

        list.delete("Hello");

        list.showList();
    }

    public static void doubleLinkedListTest() {
        DataStructures.LinkedLists.Double.LinkedList list = new DataStructures.LinkedLists.Double.LinkedList();

        list.add("Hello");
        list.add("World");
        list.add("!!!");

        list.showList();

        list.delete("!!!");

        list.showList();
    }
}
