package cn.beauty.algorithm.sort.quickSort;

import cn.beauty.algorithm.sort.BaseSort;

/**
 * BigO(n^2)
 *
 *
 */

public class QuickSort3 extends BaseSort {

    public static void quickSort(int[] unsortedArray, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int pivotIndex = partition(unsortedArray, leftIndex, rightIndex);
            quickSort(unsortedArray, leftIndex, pivotIndex - 1);
            quickSort(unsortedArray, pivotIndex + 1, rightIndex);
        }
    }

    private static int partition(int[] unsortedArray, int leftIndex, int rightIndex) {
        int pivotValue = unsortedArray[rightIndex];
        int smallestIndex = leftIndex - 1;

        for (int i = leftIndex; i < rightIndex; i++) {
            if (unsortedArray[leftIndex] < pivotValue) {
                smallestIndex++;
                int temp = unsortedArray[smallestIndex];
                unsortedArray[smallestIndex] = unsortedArray[i];
                unsortedArray[i] = temp;
            }
        }

        int temp = unsortedArray[++smallestIndex];
        unsortedArray[smallestIndex] = unsortedArray[rightIndex];
        unsortedArray[rightIndex] = temp;
        return smallestIndex;
    }

}
