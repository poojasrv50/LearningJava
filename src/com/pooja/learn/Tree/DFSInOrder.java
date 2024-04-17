package com.pooja.learn.Tree;

public class DFSInOrder {

    public static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.key);
        printInorder(root.right);
    }

    public static void printPreorder(Node root) {
        if (root == null) return;
        System.out.print(root.key);
        printPreorder(root.left);
        printPreorder(root.right);

    }
    public static void printPostorder(Node root) {
        if (root == null) return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.print(root.key);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        printInorder(root);
        System.out.println();
        printPostorder(root);
        System.out.println();
        printPreorder(root);
    }
}

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
