package cn.beauty.algorithm.sort.bubbleSort;

import cn.beauty.algorithm.sort.BaseSort;

/**
 * Created by Simon Meng on 2018/8/10.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */
public class BubbleSort extends BaseSort {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean hasChangePosition = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    hasChangePosition = true;
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }

            if (!hasChangePosition) {
                break;
            }
        }
        printArray(array);
    }

}
