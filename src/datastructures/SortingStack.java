/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import datastructures.MyStack;

/**
 *
 * @author Aditya
 * @param <T>
 */
public class SortingStack<T extends Comparable<T>> {

    public MyStack<T> sort(MyStack<T> unsortedStack) {
        MyStack sortedStack = new MyStack();
        while (!unsortedStack.isEmpty()) {
            T temp = unsortedStack.pop();
            while (!(sortedStack.isEmpty()) && (temp.compareTo((T) sortedStack.peek()) < 0)) {
                unsortedStack.push((T) sortedStack.pop());
            }
            sortedStack.push(temp);
        }
        return sortedStack;
    }

}
