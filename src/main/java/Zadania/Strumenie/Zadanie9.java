package Zadania.Strumenie;

/*Napisz strumień który pierw posortuje tablicę, odrzuci piewszy element, odrzyci ostatni element, a następnie z pozostałych liczb wyciągnie średnią*/


import java.util.Arrays;

public class Zadanie9 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3, 4, 100};
        int[] tablica2 = {1, 1, 5, 5, 10, 8, 7};
        int[] tablica3 = {-10, -4, -2, -4, -2, 0};
        int[] tablica4 = {1, 1, 100};


        System.out.println(centeredAverage(tablica1));
        System.out.println(centeredAverage(tablica2));
        System.out.println(centeredAverage(tablica3));
        System.out.println(centeredAverage(tablica4));

    }

    public static int centeredAverage(int[] nums) {
        if (nums.length >= 3) {
            return (int) Arrays.stream(nums).sorted().skip(1).limit(nums.length-2).average().getAsDouble();
        } else {
            return 0;
        }
    }
}
