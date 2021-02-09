package com.company;

class Node{
    int item;
    Node left, right;

    public Node(int key){
        item = key;
        left = right = null;
    }
}

public class Main {

    Node root;

    Main(){
        root = null;
    }

    void preorder(Node node){
        if(node == null)
            return;

        System.out.print(node.item + "->" );
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node){
        if(node == null)
            return;

        inorder(node.left);
        System.out.print(node.item + "->" );
        inorder(node.right);
    }

    void postorder(Node node){
        if(node == null)
            return;

        preorder(node.left);
        preorder(node.right);
        System.out.print(node.item + "->" );
    }



    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(6);

        System.out.println("Inorder Traversal ");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal");
        tree.preorder(tree.root);

        System.out.println("\nPostorder Traversal");
        tree.postorder(tree.root);
    }
}
