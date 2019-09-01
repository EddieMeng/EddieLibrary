package cn.beauty.algorithm.sort.selectionSort;

import cn.beauty.algorithm.sort.BaseSort;


public class SelectionSort2 extends BaseSort {

    public static void selectionSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            int minimumIndex = findMinimumIndex(unsortedArray, i);
            swapValue(unsortedArray, i, minimumIndex);
        }
        printArray(unsortedArray);
    }


    private static int findMinimumIndex(int[] unsortedArray, int startIndex) {
        int minimumValue = unsortedArray[startIndex];
        int minimumIndex = startIndex;

        for (int i = minimumIndex + 1; i < unsortedArray.length; i++) {
            if (unsortedArray[i] < minimumValue) {
                minimumIndex = i ;
                minimumValue = unsortedArray[i];
            }
        }
        return minimumIndex;
    }

   private static void swapValue(int[] unsortedArray, int leftIndex, int rightIndex) {
        int temp = unsortedArray[leftIndex];
        unsortedArray[leftIndex] = unsortedArray[rightIndex];
        unsortedArray[rightIndex] = temp;
   }



}
