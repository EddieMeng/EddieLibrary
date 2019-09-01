package cn.beauty.algorithm.sort.mergeSort;

import java.util.LinkedHashMap;

import cn.beauty.algorithm.sort.BaseSort;

/**
 * Created by Simon Meng on 2018/8/14.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */

/**
 * Time Complexity :
 * [Big-O] : o(n*logn)
 * [Big-omege] : o(n*logn)
 * Space Complexity : o(n)
 */
//todo why mergeSort complexity is O(nlogn)

public class MergeSort extends BaseSort {
    public static void mergeSort(int[] unsortArray, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(unsortArray, left, middle);
            mergeSort(unsortArray, middle + 1, right);
            merge(unsortArray, left, right, middle);
        }
    }

    private static void merge(int[] unsortArray, int left, int right, int middle) {
        int leftsize = middle - left + 1;
        int  rightSize = right - middle;

        int l[] = new int[leftsize];
        int r[] = new int[rightSize];

        for (int i = 0; i < leftsize; i++) {
            l[i] = unsortArray[left + i];
        }

        for (int i = 0; i < rightSize; i++) {
            r[i] = unsortArray[middle + i + 1];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < leftsize && j < rightSize) {
            if (l[i] < r[j]) {
                unsortArray[k] = l[i];
                i++;
                k++;
            } else {
                unsortArray[k] = r[j];
                j++;
                k++;
            }
        }

        while (i < leftsize) {
            unsortArray[k] = l[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            unsortArray[k] = r[j];
            j++;
            k++;
        }
    }

}
