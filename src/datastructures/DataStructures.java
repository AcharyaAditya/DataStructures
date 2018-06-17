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
//        singleLLCall();
//        queueUsingStack();
        sortStack();
    }

    public static void stackCall() {
        MyStack<Integer> myStack = new MyStack();
        System.out.println(myStack.isEmpty());
    }

    public static void queueCall() {
        MyQueue<Integer> myQueue = new MyQueue();
        System.out.println(myQueue.isEmpty());
    }

    public static void singleLLCall() {
        SinglyLinkedList mysll = new SinglyLinkedList();
        mysll.append(10);
        mysll.append(11);
        mysll.append(12);
        mysll.append(10);
        mysll.append(12);
        mysll.append(10);
//        System.out.println(mysll.getntolast(5));
        mysll.getAll();
        mysll.nobufferDupliDelete();
        System.out.println("After");
        mysll.getAll();
    }

    public static void doublyLLCall() {
        MyDoublyLinkedList mydll = new MyDoublyLinkedList();
    }

    public static void binaryTreeCall() {
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
        System.out.println("total nodes: " + btree.totalnodes());
    }

    public static void queueUsingStack() {
        QueueUisng2Stacks queuestack = new QueueUisng2Stacks();
        queuestack.push(10);
        queuestack.push(11);
        queuestack.push(12);
        queuestack.push(13);
        queuestack.push(14);
        queuestack.push(15);
        System.out.println(queuestack.pop());
        System.out.println(queuestack.peek());
    }

    public static void sortStack() {
        MyStack meroStack = new MyStack();
        MyStack sortedStack = new MyStack();
        SortingStack meroSorted = new SortingStack();
        meroStack.push(10);
        meroStack.push(5);
        meroStack.push(20);
        meroStack.push(17);
        meroStack.push(1);

        sortedStack = meroSorted.sort(meroStack);
        for (int i = 0; i < 5; i++) {
            System.out.println(sortedStack.pop());
        }

    }
}
