package br.com.carlos.dataStructure.sortingAlgorithms.projectImplementation;

import br.com.carlos.dataStructure.sortingAlgorithms.projectImplementation.uteis.AccentedWords;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Trabalho de estrutura de dados é muito importante para o aprendizado do aluno";

        List<AccentedWords> sortedWords = insertionSortString(text);

        for (AccentedWords word : sortedWords)
            System.out.println(word.getOriginal());
    }

    private static List<AccentedWords> insertionSortString(String text) {
        String[] array = text.split(" ");
        List<AccentedWords> words = new ArrayList<>();

        for (String word : array)
            words.add(new AccentedWords(word));

        int size = words.size();
        for (int i = 1; i < size; i++) {
            AccentedWords key = words.get(i);
            int j = i - 1;

            while (j >= 0 && key.compareTo(words.get(j)) < 0) {
                words.set(j + 1, words.get(j));
                j = j - 1;
            }

            words.set(j + 1, key);
        }

        return words;
    }
}
