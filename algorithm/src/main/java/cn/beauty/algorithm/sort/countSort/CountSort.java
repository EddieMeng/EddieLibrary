package cn.beauty.algorithm.sort.countSort;

import cn.beauty.algorithm.sort.BaseSort;


public class CountSort extends BaseSort {

    public static void countSort(int[] unsortedArray) {
        if (unsortedArray == null) {
            return;
        }

        int size = unsortedArray.length;
        int[] outputArray = new int[size];
        int[] countArray = new int[800];

        for (int i = 0; i <= size - 1; i++) {
            countArray[unsortedArray[i]] = countArray[unsortedArray[i]] + 1;
        }

        int tempTotal = 0;
        for (int i = 0; i < countArray.length; i++) {
            tempTotal += countArray[i];
            countArray[i] = tempTotal;
        }

        for (int i = size - 1; i >= 0; i--) {
            outputArray[countArray[unsortedArray[i]] - 1] = unsortedArray[i];
        }
        printArray(outputArray);
    }


}
