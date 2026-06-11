    package com.example;

    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.Scanner;

    public class Mock2 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Node root=null;
            for(int i=0;i<n;i++)
            {
                int data=sc.nextInt();
                root=insert(root,data);
            }
            topView(root);
            sc.close();
        }
        static Node insert(Node root, int data)
        {
            if(root==null)
                return new Node(data);
            if(data<=root.data)
                root.left=insert(root.left,data);
            else
                root.right=insert(root.right,data);
            return root;
        }

        static void topView(Node root)
        {

        }
    }
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }