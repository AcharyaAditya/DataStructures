/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Aditya
 */
public class DataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack <Integer> myStack =  new MyStack();
        System.out.println(myStack.isEmpty());
    
        MyQueue <Integer> myQueue = new MyQueue();
        System.out.println(myQueue.isEmpty());
        
        MyDoublyLinkedList mydll = new MyDoublyLinkedList();     
        
        SinglyLinkedList mysll = new SinglyLinkedList();

        MyBinaryTreeTraversal btree = new MyBinaryTreeTraversal();
        btree.add(100);
        btree.add(50);
        btree.add(200);
        btree.add(25);
        btree.add(75);
        btree.add(150);
        btree.add(250);
        btree.add(20);
        btree.add(45);
        btree.add(60);
        btree.add(90);
        btree.add(125);
        btree.add(175);
        btree.add(210);
        btree.add(300);
        btree.preorder();
        System.out.println();
        btree.inorder();
        System.out.println();
        btree.postorder();
        System.out.println();
        System.out.println("height: " + btree.height());
        System.out.println("total nodes: "+btree.totalnodes());
    }

}
