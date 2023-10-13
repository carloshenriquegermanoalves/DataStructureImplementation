package br.com.carlos.dataStructure.sortingAlgorithms;

import java.util.Arrays;

public class InsertionSortImplementation {

    public static int[] insertionSort(int[] vet) {
        int size = vet.length;

        for (int i = 1; i < size; i++) {
            int pivot = vet[i];

            int j = i - 1;

            while (j >= 0 && pivot < vet[j]) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }

            vet[j + 1] = pivot;
        }

        return vet;
    }

    public static void main(String[] args) {
        int[] array = {42834, 2913, -55563, 0, 230, -19233, 7344};
        int[] sortedArray = insertionSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

}
