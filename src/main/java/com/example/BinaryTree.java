package com.example;


class Node
{
    int data;
    Node left;
    Node right;
    Node(int value)
    {
        data=value;
        left= right=null;

    }

}
public class BinaryTree {
    Node root;
    BinaryTree()
    {
        root=null;
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        System.out.println(tree.root);
        tree.root=new Node(10);
        System.out.println(tree.root);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.right.left= new Node(60);
        tree.root.right.right= new Node(70);

    }
}
