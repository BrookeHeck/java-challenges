package dataStructures.KAryTree;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;;

class Node {
    String value;
    ArrayList<Node> children;

    public Node(String value) {
        this.value = value;
        this.children = new  ArrayList<>();
    }

    public void addChild(Node node) {
        this.children.add(node);
    }
}

public class KAryTree {
    Node root;
    int k;

    public KAryTree(int k, String value) {
        this.k = k;
        this.root = new Node(value);
    }

    public void add(String value) {
        Queue<Node> queue = new LinkedList<>();
        boolean isAdded = false;
        Node current = this.root;

        while(current != null && !isAdded) {
            if(current.children.size() < k) {
                current.addChild(new Node(value));
                isAdded = true;
            } else {
                for(Node node : current.children ) {
                    queue.add(node);
                }
            }

            current = queue.poll();
        }

    }
    
}
