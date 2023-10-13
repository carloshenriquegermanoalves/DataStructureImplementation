package br.com.carlos.dataStructure.sortingAlgorithms;

import java.util.Arrays;

public class QuickSortImplementation {

    public static int[] quickSort(int[] array, int begin, int end) {
        int i = begin;
        int j = end;
        int pivotIndice = (begin + end) / 2;
        int pivot = array[pivotIndice];

        while (i < j) {
            while (array[i] < pivot) {
                i = i + 1;
            }

            while (array[j] > pivot) {
                j = j - 1;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i = i + 1;
                j = j - 1;
            }
        }

        if (j > begin) {
            quickSort(array, begin, j);
        }

        if (i < end) {
            quickSort(array, i, end);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {20, 75, 32, -44, 33, 54, 88, -96};
        int[] sortedArray = quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(sortedArray));
    }

}
