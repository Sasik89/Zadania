package Zadania.coodingbat.Array2;


/*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
        either24([1, 2, 2]) → true
        either24([4, 4, 1]) → true
        either24([4, 4, 1, 2, 2]) → false*/

public class Zadanie14 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 2};
        int[] tablica2 = {4, 4, 1};
        int[] tablica3 = {4, 4, 1, 2, 2};
        int[] tablica4 = { 1, 2};

        System.out.println(either24(tablica1));
        System.out.println(either24(tablica2));
        System.out.println(either24(tablica3));
        System.out.println(either24(tablica4));

    }

    public static boolean either24(int[] nums) {
        boolean hastwo = false;
        boolean hasfour = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] == 4) {
                hasfour = true;
            }
            if (nums[i] == 2 && nums[i + 1] == 2) {
                hastwo = true;
            }
        }
        if (hasfour == hastwo) {
            return false;
        } else {
            return true;
        }
    }
}
