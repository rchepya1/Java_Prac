package com.rohith.prac;


class Node {

    int data;
    Node right, left;

    public Node (int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeExample {

    Node root;
    TreeExample (int data) {
        root = new Node(data);
    }

    TreeExample () {
        root = null;
    }

    public static void main (String[] args) {

        TreeExample tree = new TreeExample();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.left.left = new Node(4);

        tree.root.right = new Node(8);
        tree.root.right.right = new Node(6);
    }



}
