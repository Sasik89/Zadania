package Zadania.coodingbat.app1;


/*Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted.
        See wordsWithout() below which is more difficult because it uses arrays.
        wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
        wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
        wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie7 {
    public static void main(String[] args) {

        String[] tablica1 = {"a", "bb", "b", "ccc"};
        String[] tablica2 = {"a", "bb", "b", "ccc"};
        String[] tablica3 = {"a", "bb", "b", "ccc"};

        wyswietlacz(wordsWithoutList(tablica1,1));
        wyswietlacz(wordsWithoutList(tablica1,3));
        wyswietlacz(wordsWithoutList(tablica1,4));

    }

    public static List wordsWithoutList(String[] words, int len) {
        ArrayList<String> result = new ArrayList<>();
        for(String element : words){
            if(element.length()!=len){
                result.add(element);
            }
        }
        return result;
    }

    public static void wyswietlacz(List<String> tablica){
        for(String element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
