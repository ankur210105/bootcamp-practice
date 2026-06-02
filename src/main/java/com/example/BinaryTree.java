package com.example;


class Node
{
    int data;
    Node left;
    Node right;
    Node(int value)
    {
        data=value;
        left=null;
        right=null;
    }

}
public class BinaryTree {
    public static void main(String[] args) {
        Node firstNode =new Node(10);
        System.out.println(firstNode.data);
    }
}
