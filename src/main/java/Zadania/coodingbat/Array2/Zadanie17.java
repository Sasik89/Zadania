package Zadania.coodingbat.Array2;

/*

Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
        has12([1, 3, 2]) → true
        has12([3, 1, 2]) → true
        has12([3, 1, 4, 5, 2]) → true
*/

public class Zadanie17 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 3, 2};
        int[] tablica2 = {3, 1, 2};
        int[] tablica3 = {3, 1, 4, 5, 2};

        System.out.println(has12(tablica1));
        System.out.println(has12(tablica2));
        System.out.println(has12(tablica3));

    }

    public static boolean has12(int[] nums) {
        int hasone = 0;
        int hastwo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                hasone = i;
            }
            if (nums[i] == 2) {
                hastwo = i;
            }
        }
        if (hastwo > hasone) {
            return true;
        } else {
            return false;
        }
    }
}
