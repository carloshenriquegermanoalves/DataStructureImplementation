package br.com.carlos.dataStructure.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSortImplementation {
    public static int[] bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {120,485, -338, 964, 548, 69884};
        int[] sortedArray = bubbleSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
