package DataStructures.Stacks;

public class StackTest {
    public static void main(String[] args) {
        stackTest();
    }

    public static void stackTest() {
        Stack stk = new Stack();
        stk.push("Hello");
        stk.push("World");
        stk.push("!!!");

        stk.showStack();

        System.out.println("Pop element -> "+stk.pop());
        System.out.println("Pop element -> "+stk.pop());
        System.out.println("Pop element -> "+stk.pop());

        System.out.println("Is empty? "+stk.isEmpty());
    }
}
