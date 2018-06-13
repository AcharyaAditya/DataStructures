/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Aditya
 * @param <T>
 */
public class MyBinaryTreeTraversal<T extends Comparable<T>> {

    Node<T> root;

    public MyBinaryTreeTraversal() {
        root = new Node(null);
    }

    class Node<T> {

        Node<T> left;
        Node<T> right;
        T data;

        public Node(T value) {
            data = value;
        }
    }

    public boolean add(T value) {
        if (root.data == null) {
            root = new Node(value);
        } else {
            add(root, value);
        }
        return true;
    }

    private void add(Node<T> currentNode, T value) {
        if (value.compareTo(currentNode.data) < 0) {
            if (currentNode.left == null) {
                currentNode.left = new Node(value);
            } else {
                add(currentNode.left, value);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = new Node(value);
            } else {
                add(currentNode.right, value);
            }
        }
    }

    public void preorder() {
        preorder(root);
    }

    public void postorder() {
        postorder(root);
    }

    public void inorder() {
        inorder(root);
    }

    private void preorder(Node<T> currentNode) {
        System.out.print(currentNode.data + ", ");
        if (currentNode.left != null) {
            preorder(currentNode.left);
        }
        if (currentNode.right != null) {
            preorder(currentNode.right);
        }
    }

    private void postorder(Node<T> currentNode) {
        if (currentNode.left != null) {
            postorder(currentNode.left);
        }
        if (currentNode.right != null) {
            postorder(currentNode.right);
        }
        System.out.print(currentNode.data + ", ");

    }

    private void inorder(Node<T> currentNode) {
        if (currentNode.left != null) {
            inorder(currentNode.left);
        }
        System.out.print(currentNode.data + ", ");
        if (currentNode.right != null) {
            inorder(currentNode.right);
        }
    }
    
    public int height(){
        if(root.data == null){
            return 0;
        }
        return height(root);
    }
    
    private int height(Node<T> currentNode){
        int height = 0;
        if(currentNode != null){
            height = 1 + Math.max(height(currentNode.left), height(currentNode.right));
        }
        return height;
    }
    
    
    public int totalnodes(){
        if(root.data != null){
            return 1+ totalnodes(root);
        }
        return 0;
    }
    
    private int totalnodes(Node<T> currentNode){
        int leftnodes = 0;
        int rightnodes = 0;
        if(currentNode.left != null){
            leftnodes= 1 + totalnodes(currentNode.left);
        }
        if(currentNode.right != null){
            rightnodes= 1 + totalnodes(currentNode.right);
        }
        return leftnodes+rightnodes;
    }
}
