package cn.beauty.algorithm;

import cn.beauty.algorithm.sort.QuickSort;

public class MyClass {

    public static void main(String[] args) {
//        int [] unsortedArray = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int [] unsortedArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        InsertionSort.insertionSort(unsortedArray);
        QuickSort.quickSort(unsortedArray, 0, unsortedArray.length - 1);
        QuickSort.printArray(unsortedArray);
//        MergeSort.mergeSort(unsortedArray, 0, unsortedArray.length - 1);
//        MergeSort.printArray(unsortedArray);
    }

}
