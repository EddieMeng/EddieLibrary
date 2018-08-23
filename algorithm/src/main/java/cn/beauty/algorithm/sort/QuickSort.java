package cn.beauty.algorithm.sort;

/**
 * Created by Simon Meng on 2018/8/15.
 * Guangzhou Beauty Information Technology Co.,Ltd
 */
public class QuickSort extends BaseSort{

    public static void quickSort(int[] unsortedArray, int low, int high) {
        if (low  < high) {
            int pivot = partition(unsortedArray, low, high);
            quickSort(unsortedArray, low, pivot - 1);
            quickSort(unsortedArray, pivot + 1, high);
        }
    }

    private static int partition(int[] unsortArray, int low, int high) {
        int pivotValue = unsortArray[high];
        int maxValueIndex = low - 1;

        for (int j = low ;j < high; j++) {
            if (unsortArray[j] > pivotValue) {
                maxValueIndex++;
                int temp = unsortArray[maxValueIndex];
                unsortArray[maxValueIndex] = unsortArray[j];
                unsortArray[j] = temp;
            }
        }
        int temp = unsortArray[++maxValueIndex];
        unsortArray[maxValueIndex] = pivotValue;
        unsortArray[high] = temp;
        return maxValueIndex;
    }


}
