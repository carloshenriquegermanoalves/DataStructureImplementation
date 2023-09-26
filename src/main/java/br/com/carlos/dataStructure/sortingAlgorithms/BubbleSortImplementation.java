package br.com.carlos.dataStructure.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSortImplementation {

    /**
     *
     * @param array
     */

    public static void BubbleSort(int[] array) {
        int arraySize = array.length;
        boolean arraySwapped = false;
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - 1; j++)
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    arraySwapped = true;
                }
                if (!arraySwapped)
                    break;
        }
    }

    public static void main(String[] args) {
        int[] array = {67, 0, -9, 15, 700, 30, -3, 2, 0, 94};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
