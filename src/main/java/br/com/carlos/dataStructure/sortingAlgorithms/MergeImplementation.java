package br.com.carlos.dataStructure.sortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeImplementation {

    public static int[] merge(int[] vetA, int[] vetB) {
        List<Integer> vetRList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < vetA.length && j < vetB.length) {
            if (vetA[i] < vetB[j]) {
                vetRList.add(vetA[i]);
                i++;
            } else {
                vetRList.add(vetB[j]);
                j++;
            }
        }

        while (i < vetA.length) {
            vetRList.add(vetA[i]);
            i++;
        }

        while (j < vetB.length) {
            vetRList.add(vetB[j]);
            j++;
        }

        int[] vetR = new int[vetRList.size()];
        for (int k = 0; k < vetRList.size(); k++) {
            vetR[k] = vetRList.get(k);
        }

        return vetR;
    }

    public static void main(String[] args) {
        int[] vetA = {20, 50, 80, 120};
        int[] vetB = {10, 40, 70, 102};
        int[] mergedArray = merge(vetA, vetB);
        System.out.println(Arrays.toString(mergedArray));
    }
}

