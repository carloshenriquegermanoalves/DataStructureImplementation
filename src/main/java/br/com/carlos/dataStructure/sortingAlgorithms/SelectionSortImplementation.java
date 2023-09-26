package br.com.carlos.dataStructure.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSortImplementation {

    /**
     *
     * @param array
     */

    public static void SelectionSort(int[] array) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            int smallerIndex = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (array[j] < array[smallerIndex]) {
                    smallerIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[smallerIndex];
            array[smallerIndex] = tmp;;
        }
    }

    public static void main(String[] args) {
        int[] array = {67, 0, -9, 15, 700, 30, -3, 2, 0, 94};
        SelectionSort(array);
        System.out.println(Arrays.toString(array));
    }

}
