package cn.beauty.algorithm.sort.insertionSort;

import cn.beauty.algorithm.sort.BaseSort;

public class InsertionSort2 extends BaseSort {


    public static void insertionSort(int[] unsortedArray) {
        for (int i = 1; i < unsortedArray.length; i++) {
            int j = i - 1;
            while(j >= 0) {
                if (unsortedArray[j+1] < unsortedArray[j]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j] = temp;
                }
                j--;
            }
        }
        printArray(unsortedArray);
    }






}
