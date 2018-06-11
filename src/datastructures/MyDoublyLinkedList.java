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
public class MyDoublyLinkedList<E> {

    Node<E> head;
    Node<E> tail;
    int size;

    //constructor to have two dummy nodes as head and tail so that we stay within those bounds
    public MyDoublyLinkedList() {
        head = new Node<E> (null);
        tail = new Node<E> (null);
        size = 0;
        head.next = tail;
        tail.prev = head;
    }

    class Node<E> {

        Node<E> prev;
        Node<E> next;
        E data;

        Node(E value) {
            data = value;
        }
    }

    //Add value at the end of the list
    public boolean add(E value) {

        if (value == null) {
            throw new NullPointerException();
        }
        Node<E> myNode = new Node(value);
        if (size == 0) {
            myNode.prev = head;
            myNode.next = tail;
            head.next = myNode;
            tail.prev = myNode;
        } else {
            myNode.next = tail;
            myNode.prev = tail.prev;
            tail.prev.next = myNode;
            tail.prev = myNode;
        }
        size++;
        return true;
    }

    public boolean addAt(E value, int index) {
        //here index 0 is the first element. Disregard the dummy heads and tails as they are there as dummy start and end nodes
        Node<E> myNode = new Node(null);
        //check if that index is acceptable
        nullExceptions(value);
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if ((size == 0 && index == 0) || index == size) {
            add(value);
        } else {
            Node<E> currentNode = currNode(index);
            myNode.data = value;
            myNode.next = currentNode;
            myNode.prev = currentNode.prev;
            currentNode.prev.next = myNode;
            currentNode.prev = myNode;
            size++;
        }

        return true;
    }

    public E removeAt(int index) {
        indexExceptions(index);

        E deletedData;
        Node<E> currentNode = currNode(index);

        deletedData = currentNode.data;
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
        size--;
        return deletedData;
    }

    public E replaceAt(int index, E value) {
        E replacedVal;

        //Exception checks
        indexExceptions(index);
        nullExceptions(value);

        Node<E> currentNode = currNode(index);
        replacedVal = currentNode.data;
        currentNode.data = value;
        return replacedVal;
    }

    public E getEntryAt(int index) {
        indexExceptions(index);
        return currNode(index).data;
    }

    public E[] toArray() {
        E [] myListItems = (E[])new Object[size];
        Node<E> currentNode = head.next;
        int currentIndex = 0;
        while( currentNode.data != null){
            myListItems[currentIndex] = currentNode.data;
            System.out.println(currentNode.data);
            currentIndex++;
            currentNode = currentNode.next;
        }
        return myListItems;
    }

    public boolean contains(E value) {
        nullExceptions(value);
        Node<E> currentNode = head.next;
        while(currentNode.data != null){
            if (currentNode.data == value){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public boolean clear(){
        head=null;
        tail=null;
        return true;
    }

    public void indexExceptions(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

    }

    public void nullExceptions(E value) {
        if (value == null) {
            throw new NullPointerException();
        }
    }

    Node<E> currNode(int index) {
        Node<E> currentNode = head.next;
        int currentIndex = 0;
        while (currentIndex != index) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        return currentNode;
    }
}
