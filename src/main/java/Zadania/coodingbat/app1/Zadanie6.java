package Zadania.coodingbat.app1;


/*Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
        wordsFront(["a", "b", "c", "d"], 1) → ["a"]
        wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
        wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie6 {
    public static void main(String[] args) {

        String[] tablica1 = {"a", "b", "c", "d"};
        String[] tablica2 = {"a", "b", "c", "d"};
        String[] tablica3 = {"a", "b", "c", "d"};

        wyswietlacz(wordsFront(tablica1,1));
        wyswietlacz(wordsFront(tablica2,2));
        wyswietlacz(wordsFront(tablica3,3));

    }
    public static String[] wordsFront(String[] words, int n) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i<n;i++){
            result.add(words[i]);
        }
        return result.toArray(new String[0]);
    }

    public static void wyswietlacz(String[] tablica){
        for(String element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
