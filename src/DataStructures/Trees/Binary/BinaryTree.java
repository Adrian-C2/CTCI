package DataStructures.Trees.Binary;

public class BinaryTree {
    private Node root;

    public BinaryTree() { }

    public void insert(String value) {
        Node newNode = new Node(value);

        if(root == null)
            root = newNode;
        else
            insert(root, newNode);
    }

    private void insert(Node node, Node newNode) {
        if(node == null)
            return;

        if(node.getLeftChild() == null)
            node.setLeftChild(newNode);
        else if(node.getRightChild() == null)
            node.setRightChild(newNode);
        else {
            if(newNode.getValue().length() < node.getLeftChild().getValue().length())
                insert(node.getLeftChild(), newNode);
            else
                insert(node.getRightChild(), newNode);
        }
    }

    public void delete(String value) {

    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if(node == null)
            return 0;

        return size(node.getLeftChild())+1+size(node.getRightChild());
    }

    public int depth() {
        return depth(root);
    }

    private int depth(Node node) {
        if(node == null)
            return 0;

        return Math.max(depth(node.getLeftChild()), depth(node.getRightChild()))+1;
    }

    public void printTree() {
        printTree(root, "> ");
        System.out.println();
    }

    private void printTree(Node node, String marker) {
        if(node == null)
            return;

        marker = "-" + marker;

        System.out.print(marker);
        System.out.println(node.getValue()+" ");

        printTree(node.getLeftChild(), marker);

        printTree(node.getRightChild(), marker);
    }
}
