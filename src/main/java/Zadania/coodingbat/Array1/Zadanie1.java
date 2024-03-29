package Zadania.coodingbat.Array1;


/*Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false*/

public class Zadanie1 {
    public static void main(String[] args) {

        int[] tablica1 = {1,2,6};
        int[] tablica2 = {6, 1, 2, 3};
        int[] tablica3 = {13, 6, 1, 2, 3};

        System.out.println(firstLast6(tablica1));
        System.out.println(firstLast6(tablica2));
        System.out.println(firstLast6(tablica3));
    }
    public static boolean firstLast6(int[] nums) {
        if(nums[0]==6 || nums[nums.length-1]==6){
            return true;
        }
        return false;
    }


}

