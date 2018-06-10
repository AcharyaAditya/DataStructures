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
public class MyStack<E> {

    node<E> head;

    MyStack() {
        head = null;
    }

    class node<E> {

        node next;
        E data;

        node(E value) {
            this.data = value;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean push(E value) {
        node<E> myNode = new node(value);
        if (value == null) {
            throw new NullPointerException();
        }
        if (head == null) {
            head = myNode;
        } else {
            myNode.next = head;
            head = myNode;
        }
        return true;
    }

    public E pop() {
        E popData = head.data;
        if (head == null) {
            throw new IndexOutOfBoundsException();
        } else {
            head = head.next;
        }
        return popData;
    }

    public E peek() {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        return head.data;
    }

}
