package DataStructures.Trees.Binary;

public class BinaryTreeTest {

    public static void main(String[] args) {
        binaryTreeTest();
    }

    public static void binaryTreeTest() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert("Hello");
        binaryTree.insert("World");
        binaryTree.insert("!!!");

        binaryTree.insert("A");
        binaryTree.insert("Whole");
        binaryTree.insert("New");
        binaryTree.insert("Level");


        binaryTree.insert("1");
        binaryTree.insert("2");
        binaryTree.insert("3");

        System.out.println("Depth -> "+binaryTree.depth());
        System.out.println("Size -> "+binaryTree.size());

        binaryTree.printTree();
    }
}
