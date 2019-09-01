package cn.beauty.algorithm.sort.selectionSort;

import cn.beauty.algorithm.sort.BaseSort;

/**
 * unstable sort
 * [Big-O] : n^2
 * [Big-omega] : n^2
 * [Big-theta] : n^2
 *
 */
public class SelectionSort3 extends BaseSort {

    public static void selectionSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            int maximumIndex = findMaximumIndex(unsortedArray, i);
            int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[maximumIndex];
            unsortedArray[maximumIndex] = temp;
        }
        printArray(unsortedArray);
    }

    private static int findMaximumIndex(int[] unsortedArray, int startIndex) {
        int maxValue = unsortedArray[startIndex];
        int maxIndex = startIndex;
        for (int i = startIndex; i < unsortedArray.length - 1; i++) {
            if (unsortedArray[i + 1] > maxValue) {
                maxValue = unsortedArray[i + 1];
                maxIndex = i + 1;
            }
        }
        return maxIndex;
    }

}

