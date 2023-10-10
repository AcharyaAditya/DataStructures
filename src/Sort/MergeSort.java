/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author Aditya Acharya
 */
public class MergeSort {

    public void sort(int[] a) {
        int[] temp = new int[a.length];
        sort(a, temp, 0, a.length - 1);
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }

    public void sort(int[] a, int[] temp, int leftStart, int rightEnd) {
        if (leftStart < rightEnd) {
            int mid = (leftStart + rightEnd) / 2;
            sort(a, temp, leftStart, mid);
            sort(a, temp, mid + 1, rightEnd);
            merge(a, temp, leftStart, mid, rightEnd);
        }

    }

    public void merge(int[] a, int[] temp, int leftStart, int mid, int rightEnd) {
        int rightStart = mid + 1;
        int leftEnd = mid;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = mid + 1;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (a[left] < a[right]) {
                temp[index] = a[left];
                left++;
            } else {
                temp[index] = a[right];
                right++;
            }
            index++;
        }

        while (left <= leftEnd) {
            temp[index++] = a[left++];
        }

        while (right <= rightEnd) {
            temp[index++] = a[right++];
        }

        for (int i = 0; i < size; i++, leftStart++ ) {
            a[leftStart] = temp[leftStart];
        }
    }

}
