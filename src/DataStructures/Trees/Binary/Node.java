package DataStructures.Trees.Binary;

public class Node {
    private String value;
    private Node leftChild, rightChild;

    public Node() { }

    public Node(String value) {
        this.value = value;
        leftChild = rightChild = null;
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null ? true : false;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
