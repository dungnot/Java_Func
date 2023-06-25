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
public class MergeSort {

    private int[] arr;

    public MergeSort(int[] arr) {
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

        if (sortOnOrignial) {
            //create new same array, diffirent address
            sortArr = Utils.cloneArray(arr);
        }

        // Merge sort algorithism
        mergeSort(sortArr, 0, sortArr.length - 1, isAscending);

        return sortArr;
    }

    private void mergeSort(int[] arr, int l, int r, boolean isAsc) {
        // Find index of middle element
        int m = l + (r - l) / 2;
        
        // recursive: split array into smallest parts 
        if (l < r) {
            mergeSort(arr, l, m, isAsc);    // Left part 
            mergeSort(arr, m + 1, r, isAsc); // Right part 
        }
        
        // Sort and merge the parts
        merge(arr, l, r, m, isAsc);
    }

    private void merge(int[] arr, int l, int r, int m, boolean isAsc) {
        
        // Size of sub-array
        int n1 = m - l + 1;
        int n2 = r - (m + 1) + 1;
        
        // Create temp array
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data to temp array
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        // i is index of temp array L
        int i = 0;
        // j is index of temp array L
        int j = 0;
        // k is index of sub-array
        int k = l;
        
        // Copy sorted data to main array 
        while ((i < n1) && (j < n2)) {
            arr[k++] = (isAsc ? (L[i] < R[j]) : (L[i] > R[j])) ? L[i++] : R[j++]; 
        }

        // Copy remaining element in array L
        while (i < n1) {
            arr[k++] = L[i++];
        }
        // Copy remaining element in array R
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

}
