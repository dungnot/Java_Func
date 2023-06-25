/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BO.InsertionSort;
import utils.Utils;

/**
 *
 * @author khami
 */
public class Main {
    public static void main(String[] args) {
        //welcome
        System.out.println("===Insertion Sort===".toUpperCase());
        //input length of array
        int length = Utils.inputIntMinMax("Enter the number of element: ", "Wrong Input!", 1, Integer.MAX_VALUE);
        //create a ramdom integer array
        int [] arr = Utils.randomIntegerArray(length, MIN_RANDOM, MAX_RANDOM);
        //Sort by insertion sort algorithism 
        new InsertionSort(arr).displayCompare();
    }
    private static final int MAX_RANDOM = 10;
    private static final int MIN_RANDOM = 1;
}