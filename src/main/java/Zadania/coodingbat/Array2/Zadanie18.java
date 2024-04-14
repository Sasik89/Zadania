package Zadania.coodingbat.Array2;


/*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
        modThree([2, 1, 3, 5]) → true
        modThree([2, 1, 2, 5]) → false
        modThree([2, 4, 2, 5]) → true*/

public class Zadanie18 {
    public static void main(String[] args) {

        int[] tablica1 = {2, 1, 3, 5};
        int[] tablica2 = {2, 1, 2, 5};
        int[] tablica3 = {2, 4, 2, 5};

        System.out.println(modThree(tablica1));
        System.out.println(modThree(tablica2));
        System.out.println(modThree(tablica3));

    }

    public static boolean modThree(int[] nums) {
        int oddNumber = 0;
        int evenNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                oddNumber++;
                if (oddNumber == 3) {
                    return true;
                }
            } else {
                oddNumber = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNumber++;
                if (evenNumber == 3) {
                    return true;
                }
                }
            else {
                evenNumber = 0;
            }
        }
        return false;
    }
}
