package dataStructures.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    String value;
    Node left;
    Node right;

    public Node(String str) {
        this.value = str;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree(String str) {
        this.root = new Node(str);
    }

    public void add(String str) {
        Node current = this.root;
        Queue<Node> queue = new LinkedList<>();

        while(current != null) {
            if(current.left == null) {
                current.left = new Node(str);
                break;
            }
            else queue.add(current.left);
            
            if(current.right == null) {
                current.right = new Node(str);
                break;
            } else queue.add(current.right);

            current = queue.poll();
        }
    }

    public boolean contains(String str) {
        Node current = this.root;
        Queue<Node> queue = new LinkedList<>();

        while(current != null) {
            if(current.left != null) {
                if(current.left.value.equals(str)) return true;
                else queue.add(current.left);
            }
            if(current.right != null) {
                if(current.right.value.equals(str)) return true;
                else queue.add(current.right);
            }

            current = queue.poll();
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "ROOT: ";
        Node current = this.root;
        Queue<Node> queue = new LinkedList<>();
        while(current != null) {
            str = str + current.value + " ";
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
            current = queue.poll();
        }
        return str;
    }
}
