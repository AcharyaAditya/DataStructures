/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author Aditya
 */
public class Sorting {

    int[] array = new int[]{99, 89, 1, 100, 50, 49, 200, 187, 3, 6};

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private void printElements() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public int[] selection() {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
        printElements();
        return array;
    }

    public void selectionRecursion(int[] a) {
        selectionRecursion(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void selectionRecursion(int[] a, int first, int last) {
        if (first < last) {
            int min = first;
            for (int i = first; i <= last; i++) {
                if (a[i] < a[min]) {
                    min = i;
                }
            }
            swap(a, first, min);
            selectionRecursion(a, first + 1, last);
        }
    }

    public void insertionSort() {
//        int previous = 0;
        for (int i = 1; i < array.length; i++) {
            int current = i;
            while (current != 0 && array[current-1] > array[current]) {
                swap(array, current, current-1);
                current--;
            }
        }
        printElements();
    }
}
