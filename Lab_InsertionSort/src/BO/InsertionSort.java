/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import utils.Utils;

/**
 *
 * @author khami
 */
public class InsertionSort {

    private int[] arr;

    public InsertionSort() {
    }

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    private int[] getSortedArray(boolean isAscending) {
        return sort(false, isAscending);
    }

    public void displayCompare() {
        System.out.println("Original array:");
        Utils.displayIntArray(arr);
        System.out.println("Ascending array");
        Utils.displayIntArray(getSortedArray(true));
        System.out.println("Descending array");
        Utils.displayIntArray(getSortedArray(false));
    }

    private int[] sort(boolean sortOnOrignial, boolean isAscending) {

        int[] sortArr = arr;

        if (!sortOnOrignial) {
            //create new same array, diffirent address
            sortArr = Utils.cloneArray(arr);
        }
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            //if key < arr[j> then push the previous element up
            while (j >= 0 && (isAscending ? (key < arr[j]) : (key > arr[j]))) {
                arr[j + 1] = arr[j];
                j--;
            }
            //put key to last position
            j++;
            arr[j] = key;
        }
        return sortArr;
    }

}
