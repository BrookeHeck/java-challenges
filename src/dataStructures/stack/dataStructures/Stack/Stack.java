package dataStructures.Stack;

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

    public String getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
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

    public String peek() {
        if(!isEmpty()) return this.top.getValue();
        return null;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        if(isEmpty()) this.top = newNode;
        else {
            newNode.changeNext(this.top);
            this.top = newNode;
        }
    }

    public String pop() {
        if(isEmpty()) return null;
        else {
            Node temp = this.top;
            this.top = this.top.getNext();
            return temp.getValue();
        }
    }

    @Override
    public String toString() {
        Node current = this.top;
        String str = "TOP ";
        while(current != null) {
            str = str + current.getValue() + " -> ";
            current = current.getNext();
        }
        str += "BOTTOM";
        return str;
    }
}