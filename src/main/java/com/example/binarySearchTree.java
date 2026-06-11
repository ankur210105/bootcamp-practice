package com.example;

public class binarySearchTree {

    Node root;

    public binarySearchTree() {
        root = null;
    }

    // Insert
    public void insert(int data) {
        root = insertData(root, data);
    }

    private Node insertData(Node node, int data) {

        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insertData(node.left, data);
        } else if (data > node.data) {
            node.right = insertData(node.right, data);
        }

        return node;
    }

    // Inorder Traversal
    public void inorderTraversal(Node node) {

        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Search
    public Node searchBST(Node node, int key) {

        if (node == null || node.data == key) {
            return node;
        }

        if (key < node.data) {
            return searchBST(node.left, key);
        }

        return searchBST(node.right, key);
    }

    // Delete
    public Node deleteKey(Node node, int key) {

        if (node == null) {
            return null;
        }

        if (key < node.data) {
            node.left = deleteKey(node.left, key);
        } else if (key > node.data) {
            node.right = deleteKey(node.right, key);
        } else {

            // No child or one child
            if (node.left == null) {
                return node.right;
            }

            if (node.right == null) {
                return node.left;
            }

            // Two children
            node.data = findSuccessor(node.right);
            node.right = deleteKey(node.right, node.data);
        }

        return node;
    }

    // Find minimum value in subtree
    private int findSuccessor(Node node) {

        while (node.left != null) {
            node = node.left;
        }

        return node.data;
    }

    public static void main(String[] args) {

        binarySearchTree bst = new binarySearchTree();

        bst.insert(20);
        bst.insert(49);
        bst.insert(18);
        bst.insert(5);
        bst.insert(10);
        bst.insert(17);
        bst.insert(27);
        bst.insert(32);
        bst.insert(46);
        bst.insert(25);

        System.out.println("Inorder Traversal:");
        bst.inorderTraversal(bst.root);

        Node found = bst.searchBST(bst.root, 5);

        if (found != null) {
            System.out.println("\nFound: " + found.data);
        } else {
            System.out.println("\nNot Found");
        }

        bst.root = bst.deleteKey(bst.root, 20);

        System.out.println("\nAfter deleting 20:");
        bst.inorderTraversal(bst.root);
    }
}