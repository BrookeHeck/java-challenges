import dataStructures.BinaryTree.*;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree("root");

        tree.add("left");
        tree.add("right");
        tree.add("left left");
        tree.add("left right");
        tree.add("right left");
        tree.add("right right");

        System.out.println(tree.toString());
    }
}