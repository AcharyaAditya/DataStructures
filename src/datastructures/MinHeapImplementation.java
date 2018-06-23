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
public class MinHeapImplementation {
    private int capacity = 10;
    private int size = 0;
    
    int [] items = new int[capacity];
    
    private int getLeftChildIndex(int parentIndex){
        return (2*parentIndex+1);
    }
    private int getRightChildIndex(int parentIndex){
        return (2*parentIndex+2);
    }
    private int getParentIndex(int childIndex){
        return (childIndex-1)/2;
    }
    
    private boolean hasLeftChild(int index){
        return getLeftChildIndex(index)<size;
    }
    private boolean hasRightChild(int index){
        return getRightChildIndex(index)<size;
    }
    private boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }
    
    private int leftChild(int index){
        return items[getLeftChildIndex(index)];
    }
    private int rightChild(int index){
        return items[getRightChildIndex(index)];
    }
    private int parent(int index){
        return items[getParentIndex(index)];
    }
    
    private void swap(int index1, int index2){
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }
    
    private void ensureCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items, capacity*2);
            capacity = 2*capacity;
        }
    }
    
    public int peek(){
        if(size == 0){
            throw new IllegalStateException();
        }
        return items[0];
    }
    
    public int poll(){
        if(size == 0){
            throw new IllegalStateException();
        }
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
    }
    
    public void add(int item){
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }
    
    private void heapifyUp(){
         int currentIndex = size - 1;
         while(hasParent(currentIndex) && items[currentIndex] < parent(currentIndex)){
             swap(currentIndex, getParentIndex(currentIndex));
             currentIndex = getParentIndex(currentIndex);
         }
    }
    
    private void heapifyDown(){
         int currentIndex = 0;
         while(hasLeftChild(currentIndex)){
             int smallerIndex = getLeftChildIndex(currentIndex);
             if(hasRightChild(currentIndex) && leftChild(currentIndex)>rightChild(currentIndex)){
                 smallerIndex = getRightChildIndex(currentIndex);
             }
             if(items[currentIndex] > items[smallerIndex]){
                 swap(currentIndex, smallerIndex);
             }
             currentIndex = smallerIndex;
         }
    }
    
    public void findMaxElement(){
        if(size == 0){
            throw new IllegalStateException();
        }
        int max = items[0];
        int currrentIndex = 0;
        while(currrentIndex < size){
            if(!hasLeftChild(currrentIndex)&& items[currrentIndex] > max){
                    max = items[currrentIndex];
            }
            currrentIndex++;
        }
        System.out.println(max);
    }
    
}
