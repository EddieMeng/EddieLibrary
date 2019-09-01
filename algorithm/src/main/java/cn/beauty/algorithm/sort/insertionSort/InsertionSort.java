package cn.beauty.algorithm.sort.insertionSort;

import cn.beauty.algorithm.sort.BaseSort;


/**
 * It is a unstable sort algorithum;
 * Time Complexity :
 * [Big-O] : o(n^2)
 *
 * Space Complexity : o(1)
 * Stable Sort
 */

public class InsertionSort extends BaseSort {

    public static void insertionSort(int[] array) {
        for (int i = 1 ; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key)  {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;

            while (j >= 0 && array[j] > array[j + 1]) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        printArray(array);
    }
}
