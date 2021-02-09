package com.company;

class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

public class Main {

    Node root;
    
    Main(){
        root = null;
    }

    void print(){
        if(root == null)
            return;

        if(root.left == null && root.right == null){
            System.out.print(root.key + " ");
        }
    }

    public static void main(String[] args) {

    }
}
