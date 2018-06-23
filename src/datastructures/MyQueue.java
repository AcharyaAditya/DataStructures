/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Aditya
 * @param <E>
 */
public class MyQueue<E> {

    Node<E> head;
    Node<E> tail;
    int size;

    MyQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    class Node<E> {

        Node<E> next;
        E data;

        Node(E value) {
            data = value;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public boolean enqueue(E value){
        if(value == null){
            throw new NullPointerException();
        }
        Node myNode =  new Node(value);
        if(head == null){
            head = myNode;
            tail = myNode;
        }
        else{
            tail.next = myNode;
            tail = myNode;
        }
        size++;
        return true;
    }
    
    public E dequeue(){
        E deqVal;
        if(head==null){
            throw new IndexOutOfBoundsException();
        }
        deqVal = head.data;
        head = head.next;
        size--;
        return deqVal;
    }

    public E gerFront(){
        if (head==null){
            throw new IndexOutOfBoundsException();
        }
        return head.data;
    }
    
    public int getSize(){
        return size;
    }
    
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
}
