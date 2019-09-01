package cn.beauty.algorithm.search;

/**
 * limit : must be a sorted array
 * [Big-O] : log n
 */

public class BinarySearch extends BaseSearch{

    public static int binarySearch(int[] sortedArray, int target) {
        int minIndex = 0;
        int maxIndex = sortedArray.length - 1;

        int minValue = sortedArray[minIndex];
        int maxValue = sortedArray[maxIndex];
        int guessIndex = -1;

        while (maxIndex >= minIndex) {
            guessIndex = (maxIndex + minIndex) / 2;
            if (sortedArray[guessIndex] == target) {
                printIndex(guessIndex);
                return guessIndex;
            } else if (sortedArray[guessIndex] > target) {
                maxIndex = guessIndex - 1;
            } else if (sortedArray[guessIndex] < target) {
                minIndex = guessIndex + 1;
            }
        }
        guessIndex = -1;
        printIndex(guessIndex);
        return guessIndex;
    }
}
