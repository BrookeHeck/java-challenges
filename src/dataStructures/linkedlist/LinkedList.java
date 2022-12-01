package dataStructures.linkedlist;

class Node {
    public String value;
    public Node next;
    public Node(String value) {
        this.value = value;
        this.next = null;
    }

    public void addNext(Node node) {
        this.next = node;
    }
}

public class LinkedList {
    private Node head;
    public LinkedList() {
        this.head = null;
    }

    public void insert() {

    }

    public void append(String value) {
        Node newNode = new Node(value);
        Node current = this.head;
        while(current.next != null) {
            current = current.next;
        }
        current.addNext(newNode);
    }


    @Override
    public String toString() {
        Node current = this.head;
        String str = "HEAD -> ";
        while(current != null) {
            str += (current.value + " -> ");
            current = current.next;
        }
        str += "NULL";
        return str;
    }
}
