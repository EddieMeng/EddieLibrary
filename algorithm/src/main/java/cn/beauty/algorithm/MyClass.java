package cn.beauty.algorithm;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

import cn.beauty.algorithm.search.BinarySearch;
import cn.beauty.algorithm.sort.countSort.CountSort;
import cn.beauty.algorithm.sort.insertionSort.InsertionSort;
import cn.beauty.algorithm.sort.insertionSort.InsertionSort2;
import cn.beauty.algorithm.sort.mergeSort.MergeSort;
import cn.beauty.algorithm.sort.quickSort.QuickSort;
import cn.beauty.algorithm.sort.quickSort.QuickSort2;
import cn.beauty.algorithm.sort.quickSort.QuickSort3;
import cn.beauty.algorithm.sort.selectionSort.SelectionSort;
import cn.beauty.algorithm.sort.selectionSort.SelectionSort2;
import cn.beauty.algorithm.sort.selectionSort.SelectionSort3;

public class MyClass {

    public static void main(String[] args) {
        int[] arrayDescend = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrayAscend = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

//        CountSort.countSort(arrayDescend);
//        BubbleSort.bubbleSort(unsortedArrayDescend);
//        InsertionSort.insertionSort(unsortedArray);
//        SelectionSort.selectionSort(unsortedArrayDescend);
//        InsertionSort.insertionSort(unsortedArrayDescend);

//        InsertionSort2.insertionSort(unsortedArrayDescend);
//        SelectionSort2.selectionSort(unsortedArrayDescend);

//        QuickSort.quickSort(arrayAscend, 0, arrayAscend.length - 1);
//        QuickSort.printArray(arrayAscend);

//        QuickSort2.quickSort(arrayDescend, 0, arrayAscend.length - 1);
//        QuickSort2.printArray(arrayDescend);

        QuickSort3.quickSort(arrayDescend, 0, arrayDescend.length - 1);
        QuickSort3.printArray(arrayDescend);

//        MergeSort.mergeSort(arrayDescend, 0, arrayDescend.length - 1);
//        MergeSort.printArray(arrayDescend);

//        SelectionSort3.selectionSort(unsortedArrayAscend);
//        BinarySearch.binarySearch(arrayAscend, 21);
    }

}
