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
public class QueueUisng2Stacks<T> {

    MyStack<T> s1 = new MyStack();
    MyStack<T> s2 = new MyStack();

    public QueueUisng2Stacks() {
    }

    public void push(T value) {
        s1.push(value);
    }

    public T pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public T peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

}
