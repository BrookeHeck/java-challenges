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
        if(this.top == null) return true;
        return false;
    }

    public Node peek() {
        if(!isEmpty()) return this.head.value;
        return null;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        if(isEmpty()) this.head = newNode;
        else {
            newNode.changeNext(this.head);
            this.head = newNode;
        }
    }

    public Node pop() {
        if(isEmpty()) return null;
        else {
            Node temp = this.head;
            this.head = this.head.next;
            return temp.value;
        }
    }

    @Override
    public String toString() {
        Node current = this.head;
        String str = "TOP ";
        while(current != null) {
            str = str + current.value + " -> ";
            current = current.next;
        }
        str += "BOTTOM";
        return str;
    }
}