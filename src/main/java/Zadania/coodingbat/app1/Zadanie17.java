package Zadania.coodingbat.app1;


/*(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.
Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index,
however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7.
The start end end index will both be valid indexes into the array with start <= end.
(Odmiana problemu sumHeights.) Mamy tablicę wysokości reprezentującą wysokość wzdłuż szlaku pieszego.
Biorąc pod uwagę indeksy początkowe/końcowe w tablicy, zwróć sumę zmian dla spaceru rozpoczynającego się od indeksu początkowego i kończącego się na indeksie końcowym,
jednak wzrost wzrostu liczy się podwójnie. Na przykład przy wysokościach {5, 3, 6, 7, 2} i początku = 2, końcu = 4 daje sumę 1*2 + 5 = 7.
Obydwa indeksy start end end będą prawidłowymi indeksami tablicy z start <= end.
        sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
        sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
        sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15*/

public class Zadanie17 {
    public static void main(String[] args) {

        int[] tablica1 = {5, 3, 6, 7, 2};
        int[] tablica2 = {5, 3, 6, 7, 2};
        int[] tablica3 = {5, 3, 6, 7, 2};

        System.out.println(sumHeights2(tablica1,2,4));
        System.out.println(sumHeights2(tablica2,0,1));
        System.out.println(sumHeights2(tablica3,0,4));

    }
    public static int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for(int i = start; i<end; i++) {
            if (heights[i + 1] > heights[i]) {
                sum = sum + Math.abs(heights[i + 1] - heights[i])*2;
            }
            else {
                sum = sum + Math.abs(heights[i + 1] - heights[i]);
            }
        }
        return sum;
    }
}
