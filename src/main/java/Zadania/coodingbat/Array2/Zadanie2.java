package Zadania.coodingbat.Array2;


/*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
        bigDiff([10, 3, 5, 6]) → 7
        bigDiff([7, 2, 10, 9]) → 8
        bigDiff([2, 10, 7, 2]) → 8*/


import java.util.Arrays;
import java.util.OptionalInt;

public class Zadanie2 {
    public static void main(String[] args) {

        int[] tablica1 = {10, 3, 5, 6};
        int[] tablica2 = {7, 2, 10, 9};
        int[] tablica3 = {2, 10, 7, 25};

        System.out.println(bigDiff(tablica1));
        System.out.println(bigDiff(tablica2));
        System.out.println(bigDiff(tablica3));

    }
    public static int bigDiff(int[] nums) {
        OptionalInt min = Arrays.stream(nums).min();
        OptionalInt max = Arrays.stream(nums).max();

        if(min.isPresent() && max.isPresent()) {
            return max.getAsInt()- min.getAsInt();
        } else {
            return OptionalInt.empty().getAsInt();
        }

    }
}
