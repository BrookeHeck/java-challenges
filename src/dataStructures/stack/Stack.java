class Node {
    private String value;

    private Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }

    public void changeNext(Node node) {
        this.next = node;
    }
}

public class Stack {
    Node top;

    public Stack() {
        this.top = null;
    }

    public Boolean isEmpty() {

    }

    public Node peek() {

    }

    public void push(String value) {

    }

    public Node pop() {

    }

    @Override
    public String toString() {
        
    }
}