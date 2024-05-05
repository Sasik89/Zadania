package Zadania.coodingbat.app1;


/*Given an array of strings, return the count of the number of strings with the given length.
        wordsCount(["a", "bb", "b", "ccc"], 1) → 2
        wordsCount(["a", "bb", "b", "ccc"], 3) → 1
        wordsCount(["a", "bb", "b", "ccc"], 4) → 0*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie5 {
    public static void main(String[] args) {

        String[] tablica1 = {"a", "bb", "b", "ccc"};
        String[] tablica2 = {"a", "bb", "b", "ccc"};
        String[] tablica3 = {"a", "bb", "b", "ccc"};

        System.out.println(wordsCount(tablica1, 1));
        System.out.println(wordsCount(tablica2, 3));
        System.out.println(wordsCount(tablica3, 4));

    }

    public static int wordsCount(String[] words, int len) {
        int result = 0;
        for (String element : words) {
            if (element.length() == len) {
                result++;
            }
        }
        return result;
    }

}
