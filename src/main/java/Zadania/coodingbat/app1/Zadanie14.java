package Zadania.coodingbat.app1;


/*
Given an array of strings, return a new array without the strings that are equal to the target string.
One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.
Biorąc pod uwagę tablicę ciągów, zwróć nową tablicę bez ciągów równych ciągowi docelowemu.
Jednym ze sposobów jest policzenie wystąpień docelowego ciągu, utworzenie nowej tablicy o prawidłowej długości, a następnie skopiowanie odpowiednich ciągów.

        wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
        wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
        wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie14 {
    public static void main(String[] args) {

        String[] tablica1 = {"a", "b", "c", "a"};
        String[] tablica2 = {"a", "b", "c", "a"};
        String[] tablica3 = {"a", "b", "c", "a"};

        wyswietlacz(wordsWithout(tablica1,"a"));
        wyswietlacz(wordsWithout(tablica2,"b"));
        wyswietlacz(wordsWithout(tablica3,"c"));

    }

    public static String[] wordsWithout(String[] words, String target) {
        List<String> result = new ArrayList<>();
        for(int i =0; i<words.length;i++){
            if(words[i]!=target){
                result.add(words[i]);
            }
        }
        return result.toArray(new String[0]);
    }

    public static void wyswietlacz(String[] a){
        for(String element: a){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
