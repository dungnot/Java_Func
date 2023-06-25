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
public class BubbleSort {

    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getSortedArray(boolean isAscending) {
        return sort(false, isAscending);
    }

// phần này thầy yêu cầu để in sang bên ui.Main nhưng t chưa sửa


    // sortOnOrignial: true -> sắp xếp trên mảng cũ
    // isAscending: true -> sap xep tang | false -> sap xep giam
    private int[] sort(boolean sortOnOrignial, boolean isAscending) {

        int[] sortArr = arr;

        if (!sortOnOrignial) {
            //create new same array, diffirent address
            sortArr = Utils.cloneArray(arr);
        }
        // algorithism
        for (int i = 0; i < sortArr.length; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (!isAscending) {
                    if (sortArr[j] < sortArr[j + 1]) {
                        int temp = sortArr[j];
                        sortArr[j] = sortArr[j + 1];
                        sortArr[j + 1] = temp;
                    }
                } else {
                    if (sortArr[j] > sortArr[j + 1]) {
                        int temp = sortArr[j];
                        sortArr[j] = sortArr[j + 1];
                        sortArr[j + 1] = temp;
                    }
                }

            }
        }

        return sortArr;
    }

}
