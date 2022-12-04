package dataStructures.linkedlist;

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

public class LinkedList {
    private Node head;
    public LinkedList() {
        this.head = null;
    }

    public void insert(String value) {
        Node newNode = new Node(value);
        if(this.head != null) {
            newNode.changeNext(this.head);
            this.head = newNode;
        } else this.head = newNode;
    }

    public void append(String value) {
        Node newNode = new Node(value);
        Node current = this.head;
        if(current == null) this.head = newNode;
        else {
            while(current.next != null) {
                System.out.println(current);
                current = current.next;
            }
            current.changeNext(newNode);
        }
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
