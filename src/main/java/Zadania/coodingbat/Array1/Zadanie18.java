package Zadania.coodingbat.Array1;


/*Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
        biggerTwo([1, 2], [3, 4]) → [3, 4]
        biggerTwo([3, 4], [1, 2]) → [3, 4]
        biggerTwo([1, 1], [1, 2]) → [1, 2]*/

import java.util.Arrays;

public class Zadanie18 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2};
        int[] tablica1a = {3, 4};
        int[] tablica2 = {3, 4};
        int[] tablica2a = {1, 2};
        int[] tablica3 = {1, 1};
        int[] tablica3a = {1, 2};

    }

    public static int[] biggerTwo(int[] a, int[] b) {
        if (Arrays.stream(a).sum() > Arrays.stream(b).sum()) {
            return a;
        } else if (Arrays.stream(a).sum() < Arrays.stream(b).sum()) {
            return b;
        }
        return a;
    }
}
