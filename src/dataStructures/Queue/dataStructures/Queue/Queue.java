package dataStructures.Queue;

class Node {
    public String value;
    public Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }

    public void changeNext(Node node) {
        this.next = node;
    }
}

public class Queue {
    Node head;
    Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public Boolean isEmpty() {
        if(this.head != null) return true;
        return false;
    }

    public Node peek() {
        if(!isEmpty()) return this.head;
        return null;
    }

    public void enqueue(String value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            this.head = newNode;
        } else if(this.tail == null) {
            this.tail = newNode;
            this.head.changeNext(newNode);
        } else {
            this.tail.changeNext(newNode);
            this.tail = newNode;
        }
    }

    public Node dequeue() {
        if(!isEmpty()) {
            Node temp = this.head;
            this.head = this.head.next;
            return temp;
        }
        return null;
    }

    @Override
    public String toString() {
        Node current = this.head;
        String str = "FRONT ";
        while(current != null) {
            str = str + current.value + " -> ";
            current = current.next;
        }
        str += "REAR";
        return str;
    }
}