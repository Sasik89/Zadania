/*

Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
Zwróć liczbę parzystych liczb całkowitych w podanej tablicy. Uwaga: operator % „mod” oblicza resztę, np. 5% 2 to 1.

        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0
*/

package Zadania.coodingbat;

import java.util.Arrays;

public class Zadanie4 {

    // TODO: 13.01.2024 Działa 
    
    public static void main(String[] args) {

        int[] tablica1 = {2, 1, 2, 3, 4};
        int[] tablica2 = {2, 2, 0, 8, 10, 15, 45, 123, 4, 6,12, 46,12};
        int[] tablica3 = {1, 3, 5};


        countEvans(tablica1);
        countEvans(tablica2);
        countEvans(tablica3);

        countEvansStream(tablica1);
        countEvansStream(tablica2);
        countEvansStream(tablica3);

    }

    //pętlą foreach
    public static void countEvans(int[] tablica){
        int counter = 0;
        for (int liczba:tablica) {
            if(liczba%2 == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }

    //strumieniem
    public static void countEvansStream(int[] tablica){
       String liczba = String.valueOf(Arrays.stream(tablica).filter(i-> i%2 == 0).count());
        System.out.println(liczba);
    }

}
