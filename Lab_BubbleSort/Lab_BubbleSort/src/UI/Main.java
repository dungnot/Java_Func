/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BO.BubbleSort;
import java.util.Arrays;
import utils.Utils;

/**
 *
 * @author khami
 */
public class Main {
    public static void main(String[] args) {
        //welcome
        System.out.println("===Bubble Sort===".toUpperCase());
        //input length of array
        int length = Utils.inputIntMinMax("Enter the number of element: ", "Wrong Input!", 1, Integer.MAX_VALUE);
        //create a ramdom integer array
        int [] arr = Utils.randomIntegerArray(length, MIN_RANDOM, MAX_RANDOM);
        // 3 5 23 5 7 3
        //Sort by insertion sort algorithism 
        System.out.println("Array: " + Arrays.toString(arr));
        int [] sortedArr = new BubbleSort(arr).getSortedArray(true);
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
    private static final int MAX_RANDOM = 10;
    private static final int MIN_RANDOM = 1;
}