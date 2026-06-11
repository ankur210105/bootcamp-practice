package com.example;

public class lc94 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);   // L
        System.out.print(node.data + " "); // D
        inOrderTraversal(node.right);  // R
    }

    public static void main(String[] args) {

        lc94 tree = new lc94();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);

        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);

        System.out.print("Inorder Traversal: ");
        tree.inOrderTraversal(tree.root);
    }
}