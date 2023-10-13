package br.com.carlos.dataStructure.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSortSmartImplementation {

    public static int[] bubbleSortSmart(int[] vet) {
        int size = vet.length;
        boolean swap = true;

        for (int i = 0; i < size - 1; i++) {
            if (!swap) {
                break;
            }

            swap = false;
            int lim2 = (size - 1) - i;

            for (int j = 0; j < lim2; j++) {
                if (vet[j] > vet[j + 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                    swap = true;
                }
            }
        }

        return vet;
    }

    public static void main(String[] args) {
        int[] array = {99, -100, 5646, 548, 838, 9484348};
        int[] sortedArray = bubbleSortSmart(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}

