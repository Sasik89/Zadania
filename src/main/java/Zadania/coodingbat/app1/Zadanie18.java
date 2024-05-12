package Zadania.coodingbat.app1;

/*(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.
Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index.
We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end.
(Odmiana problemu sumHeights.) Mamy tablicę wysokości reprezentującą wysokość wzdłuż szlaku pieszego.
Biorąc pod uwagę indeksy początkowe/końcowe w tablicy, zwróć liczbę „dużych” kroków dla spaceru zaczynającego się od indeksu początkowego i kończącego się na indeksie końcowym.
Powiemy, że krok jest duży, jeśli wynosi 5 lub więcej w górę lub w dół. Obydwa indeksy start end end będą prawidłowymi indeksami tablicy z start <= end.
        bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
        bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
        bigHeights([5, 3, 6, 7, 2], 0, 4) → 1*/

public class Zadanie18 {
    public static void main(String[] args) {

        int[] tablica1 = {5, 3, 6, 7, 2};
        int[] tablica2 = {5, 3, 6, 7, 2};
        int[] tablica3 = {5, 3, 6, 7, 2};

        System.out.println(bigHeights(tablica1,2,4));
        System.out.println(bigHeights(tablica2,0,1));
        System.out.println(bigHeights(tablica3,0,4));

    }
    public static int bigHeights(int[] heights, int start, int end) {
        int sum = 0;
        for(int i = start; i<end; i++) {
            if (Math.abs(heights[i + 1] - heights[i])>=5) {
               sum++;
            }
        }
        return sum;
    }


}
