package br.com.carlos.dataStructure.sortingAlgorithms;

import java.util.Arrays;

import static br.com.carlos.dataStructure.sortingAlgorithms.MergeImplementation.merge;

public class MergeSortImplementation {

    public static int[] mergeSort(int[] vet, int begin, int end) {
        if (begin == end) {
            int[] temp = new int[1];
            temp[0] = vet[begin];
            return temp;
        }

        int middle = (begin + end) / 2;

        int[] tempA = mergeSort(vet, begin, middle);
        int[] tempB = mergeSort(vet, middle + 1, end);

        return merge(tempA, tempB);
    }

    public static void main(String[] args) {
        int[] array = {516, -564, 564, 5, 56, 102, -47683};
        int[] sortedArray = mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(sortedArray));
    }
}
