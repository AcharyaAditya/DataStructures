/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Arrays;

/**
 *
 * @author Aditya
 */
public class MaxHeapImplementation {

    int capacity = 10;
    int size = 0;
    int items[] = new int[capacity];

    private int getLeftIndex(int currentIndex) {
        return (2 * currentIndex) + 1;
    }

    private int getRightIndex(int currentIndex) {
        return (2 * currentIndex) + 2;
    }

    private int getParentIndex(int currentIndex) {
        return (currentIndex - 1) / 2;
    }

    private boolean hasLeft(int currentIndex) {
        return getLeftIndex(currentIndex) < size;
    }

    private boolean hasRight(int currentIndex) {
        return getRightIndex(currentIndex) < size;
    }

    private boolean hasParent(int currentIndex) {
        return getParentIndex(currentIndex) >= 0;
    }

    private int leftChildVal(int currentIndex) {
        return items[getLeftIndex(currentIndex)];
    }

    private int rightChildVal(int currentIndex) {
        return items[getRightIndex(currentIndex)];
    }

    private int parentVal(int currentIndex) {
        return items[getParentIndex(currentIndex)];
    }

    private void swap(int index1, int index2) {
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity = 2 * capacity;
        }
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return items[0];
    }

    public void add(int item) {
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public int poll() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        int item = items[0];
        items[0] = items[size - 1];
        heapifyDown();
        return item;
    }

    private void heapifyUp() {
        int curIndx = size - 1;
        while (hasParent(curIndx) && (items[curIndx] > parentVal(curIndx))) {
            swap(curIndx, getParentIndex(curIndx));
            curIndx = getParentIndex(curIndx);
        }
    }

    private void heapifyDown() {
        int currIndx = 0;
        while (hasLeft(currIndx)) {
            int maxChildIndex = getLeftIndex(currIndx);
            if(hasRight(currIndx) && rightChildVal(currIndx) > leftChildVal(currIndx) ){
                maxChildIndex = getRightIndex(currIndx);
            }
            if(items[currIndx] < items[maxChildIndex]){
                swap(currIndx, maxChildIndex);
            }else{
                break;
            }
            currIndx = maxChildIndex;
        }
    }
}
