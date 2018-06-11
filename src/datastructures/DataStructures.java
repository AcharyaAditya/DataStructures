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
    }
    
}
