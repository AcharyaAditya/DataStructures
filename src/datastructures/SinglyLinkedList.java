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
public class SinglyLinkedList<E> {

    Node<E> head;
    int size;

    public SinglyLinkedList() {
        head = new Node(null);
        size = 0;
    }

    class Node<E> {

        Node<E> next;
        E data;

        Node(E value) {
            data = value;
        }
    }

    public boolean append(E value) {
        nullExceptions(value);
        Node<E> myNode = new Node(value);
        Node<E> currentNode = head;

        if (head.next == null) {
            head.next = myNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = myNode;
        }
        size++;
        return true;
    }

    public boolean prepend(E value) {
        nullExceptions(value);
        Node<E> myNode = new Node(value);
        myNode.next = head.next;
        head.next = myNode;
        size++;
        return true;
    }

    //removes all the entries with given values, including consecutive values
    public boolean delWithValue(E value) {
        Node<E> currentNode = head;
        Node<E> stopNode;
        while (currentNode.next != null) {

            if (currentNode.next.data == value) {

                stopNode = currentNode;
                while (currentNode.next.data == value) {
                    System.out.println("Hello");
                    currentNode = currentNode.next;
                }
                stopNode.next = currentNode.next;
            }
            currentNode = currentNode.next;
        }
        return true;
    }

    public void getAll() {
        Node<E> currentNode = head.next;
        if (size > 0) {
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public void nullExceptions(E value) {
        if (value == null) {
            throw new NullPointerException();
        }
    }
}
