package cn.beauty.algorithm.sort.selectionSort;

import cn.beauty.algorithm.sort.BaseSort;

/**
 * It is a unstable sort algorithum;
 * Time Complexity : [Big O] (n^2)
 * Space Complexity : o(1)
 */

public class SelectionSort extends BaseSort {
    private static SelectionSort sInstance = new SelectionSort();

    public static void selectionSort(int[] unsortedArray) {
        int length = unsortedArray.length;
        for (int i = 0; i < length; i++) {
            int minumumIndex = sInstance.indexOfMinimum(unsortedArray, i);
            sInstance.swapValue(unsortedArray, i, minumumIndex);
        }
        printArray(unsortedArray);
    }

    private int indexOfMinimum(int[] unsortedArray, int startIndex) {
        int length = unsortedArray.length;
        int minimumValue = unsortedArray[startIndex];
        int minimumIndex = startIndex;

        for (int i  = startIndex + 1; i < length; i++) {
            if (unsortedArray[i] < minimumValue) {
                minimumValue = unsortedArray[minimumIndex];
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }

    private void swapValue(int[] unsortArray, int firstPosition, int secondPosition) {
        int temp = unsortArray[firstPosition];
        unsortArray[firstPosition] = unsortArray[secondPosition];
        unsortArray[secondPosition] = temp;
    }

}
