package Zadania.coodingbat.Array2;


/*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10.
Dla każdej wielokrotności 10 w danej tablicy zmień wszystkie wartości następujące po niej na tę wielokrotność 10, aż napotkasz kolejną wielokrotność 10
        So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
        tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
        tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
        tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie25 {
    public static void main(String[] args) {

        // TODO: 16.04.2024 do dokończenia 

        int[] tablica1 = {2, 10, 3, 4, 20, 5};
        int[] tablica2 = {10, 1, 20, 2};
        int[] tablica3 = {10, 1, 9, 20};

        wyswietlacz(tenRun(tablica1));
        wyswietlacz(tenRun(tablica2));
        wyswietlacz(tenRun(tablica3));

    }

    public static int[] tenRun(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                int a = nums[i];
                do {
                    arr.add(a);
                    i++;
                }
                while (nums[i] % 10 != 0);
            } else if (nums[i] % 10 != 0) {
                arr.add(nums[i]);
            }
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void wyswietlacz(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
