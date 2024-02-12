package Zadania.coodingbat;

/*Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
 The original array will contain at least "count" even numbers.

Biorąc pod uwagę tablicę dodatnich wartości całkowitych, zwróć nową tablicę o długości „count” zawierającą pierwsze liczby parzyste z oryginalnej tablicy.
 Oryginalna tablica będzie zawierać co najmniej liczby parzyste „count”.

        copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
        copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
        copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie17 {
    public static void main(String[] args) {

        int[] tablica1 = {3, 2, 4, 5, 8};
        int[] tablica2 = {3, 2, 4, 5, 8};
        int[] tablica3 = {6, 1, 2, 4, 5, 8};

        WyswietlaczTablicy(copyEvens(tablica1, 2));
        WyswietlaczTablicy(copyEvens(tablica2, 2));
        WyswietlaczTablicy(copyEvens(tablica3, 3));
    }

    public static int[] copyEvens(int[] nums, int count) {
        List<Integer> nowaLista = new ArrayList<>();
        int counter = 0;
            for(int element : nums){
                if(element%2 == 0){
                    nowaLista.add(element);
                    counter++;
                    if(counter==count){
                        break;
                    }
                }
            }
        return nowaLista.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void WyswietlaczTablicy(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
