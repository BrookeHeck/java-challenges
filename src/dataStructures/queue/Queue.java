class Node {
    public String value;
    public Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }

    public changeNext(Node node) {
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
        if(this.front != null) return true;
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
        } else if(this.rear == null) {
            this.rear = newNode;
            this.head.changeNext(newNode);
        } else {
            this.rear.changeNext(newNode);
            this.rear = newNode;
        }
    }

    public Node dequeue() {
        Node temp = this.front;
        this.front = this.front.next;
        return temp;
    }

    @Override
    public String toString() {
        
    }
}