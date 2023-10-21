package br.com.carlos.dataStructure.sortingAlgorithms.projectImplementation.uteis;

import org.jetbrains.annotations.NotNull;

import java.text.Normalizer;


/**
 * Classe criada para o tratamento de palavras e/ou letras acentuadas
 * É útil para que os valores acentuados não venham a ser ordenados depois dos que não tem acento.
 * Retira o acento das letras, compara sem que haja acento e, após a ordenação,
 * Coloca novamente os acentos para a lista ordenada de palavras.
 * Assim, a ordenação ocorre de maneira correta, sem que os acentos interfiram na ordenação.
 */

public class AccentedWords implements Comparable<AccentedWords> {
    private final String original;

    public AccentedWords(String word) {
        this.original = word;
    }

    //Recupera a palavra original passada como parâmetro
    public String getOriginal() {
        return original;
    }

    // Remove acentos das palavras usando a classe Normalizer
    private String removeAccents(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    //Compara as versões sem acentos das palavras
    @Override
    public int compareTo(@NotNull AccentedWords otherWord) {
        String word2WithoutAccents = removeAccents(otherWord.original).toLowerCase();
        String word1WithoutAccents = removeAccents(original).toLowerCase();
        return word1WithoutAccents.compareTo(word2WithoutAccents);
    }
}
