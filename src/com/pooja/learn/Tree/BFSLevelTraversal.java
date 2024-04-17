package com.pooja.learn.Tree;

public class BFSLevelTraversal {

    public static void printTraversal(NodeBFS root) {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printCurrentLevel(root,i);
        }


    }

    public static int height(NodeBFS root) {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }

    }
    public static void printCurrentLevel(NodeBFS root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }


    public static void main(String[] args) {
        NodeBFS tree = new NodeBFS(1);
        tree.left = new NodeBFS(2);
        tree.right = new NodeBFS(3);
        tree.left.left = new NodeBFS(4);
        tree.left.right = new NodeBFS(5);
        System.out.println("Level order traversal of"
                + "binary tree is ");
        printTraversal(tree);


    }
}

class NodeBFS {
    int data;
    NodeBFS left, right;

    public NodeBFS(int item) {
        data = item;
        left = right = null;
    }
}

