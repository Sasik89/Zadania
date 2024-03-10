package Zadania.coodingbat.Array1;

/*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.
        maxTriple([1, 2, 3]) → 3
        maxTriple([1, 5, 3]) → 5
        maxTriple([5, 2, 3]) → 5*/

public class Zadanie23 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {1, 5, 3};
        int[] tablica3 = {5, 2, 3};

        System.out.println(maxTriple(tablica1));
        System.out.println(maxTriple(tablica2));
        System.out.println(maxTriple(tablica3));

    }

    public static int maxTriple(int[] nums) {
        int min = nums[0];
        if (nums[(nums.length) / 2] > min) {
            min = nums[(nums.length) / 2];
        }
        if (nums[(nums.length)-1] > min) {
            min = nums[(nums.length)-1];
        }
        return min;
    }
}