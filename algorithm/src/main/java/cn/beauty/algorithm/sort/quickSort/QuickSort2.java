package cn.beauty.algorithm.sort.quickSort;

import cn.beauty.algorithm.sort.BaseSort;

/**
 * Time Complexity :
 * [Big-O] : O(n^2)
 * [Big-omega] : O(n*logn)
 * [Big-theta] : O(n*logn)
 *
 * Space Complexity :
 * O(n*logn)
 */

public class QuickSort2 extends BaseSort {

    public static void quickSort(int[] unsortedArray, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int index = partition(unsortedArray, leftIndex, rightIndex);
            quickSort(unsortedArray, 0, index - 1);
            quickSort(unsortedArray,index + 1, rightIndex);
        }
    }

    private static int partition(int[] unsortedArray, int leftIndex, int rightIndex) {
        int pivotValue = unsortedArray[leftIndex];
        int smallIndex = -1;
        int partitionIndex = -1;
        for (int i = leftIndex + 1; i <= rightIndex; i++) {
            if (pivotValue > unsortedArray[i]) {
                smallIndex++;
                swapValue(unsortedArray, i, smallIndex);
                partitionIndex++;
            }
        }
        swapValue(unsortedArray, ++partitionIndex, rightIndex);
        return partitionIndex;
    }

    private static void swapValue(int[] unsortedArray, int left, int right) {
        int temp = unsortedArray[right];
        unsortedArray[right] =  unsortedArray[left];
        unsortedArray[left] = temp;
    }


}
