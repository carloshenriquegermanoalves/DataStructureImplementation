package br.com.carlos.dataStructure.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSortImplementation {

    public static int[] selectionSort(int[] vet) {
        int size = vet.length;

        for (int i = 0; i < size - 1; i++) {
            int menor = i;

            for (int j = i + 1; j < size; j++) {
                if (vet[menor] > vet[j]) {
                    menor = j;
                }
            }

            if (menor != i) {
                int temp = vet[i];
                vet[i] = vet[menor];
                vet[menor] = temp;
            }
        }

        return vet;
    }

    public static void main(String[] args) {
        int[] array = {67, 0, -9, 15, 700, 30, -3, 2, 0, 94};
        int[] sortedArray = selectionSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

}
