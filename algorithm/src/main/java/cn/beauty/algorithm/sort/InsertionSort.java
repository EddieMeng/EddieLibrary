package cn.beauty.algorithm.sort;

/**
 * Created by Simon Meng on 2018/8/10.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */
public class InsertionSort extends BaseSort{

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
        printArray(array);
    }
}
