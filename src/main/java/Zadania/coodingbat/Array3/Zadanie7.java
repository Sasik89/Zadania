package Zadania.coodingbat.Array3;


/*Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
        Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
        seriesUp(3) → [1, 1, 2, 1, 2, 3]
        seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        seriesUp(2) → [1, 1, 2]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie7 {
    public static void main(String[] args) {

        wyswietlacz(seriesUp(3));
        wyswietlacz(seriesUp(4));
        wyswietlacz(seriesUp(2));


    }

    public static int[] seriesUp(int n) {
        List<Integer> result = new ArrayList<>();
        int start = 1;
        while (start <= n) {
            for (int i = 1; i <= start; i++) {
                result.add(i);
            }
            start++;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void wyswietlacz(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
