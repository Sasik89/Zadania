package Zadania.coodingbat.Array2;


/*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
        sum28([2, 3, 2, 2, 4, 2]) → true
        sum28([2, 3, 2, 2, 4, 2, 2]) → false
        sum28([1, 2, 3, 4]) → false*/

public class Zadanie8 {
    public static void main(String[] args) {

        int[] tablica1 = {2, 3, 2, 2, 4, 2};
        int[] tablica2 = {2, 3, 2, 2, 4, 2, 2};
        int[] tablica3 = {1, 2, 3, 4};

        System.out.println(sum28(tablica1));
        System.out.println(sum28(tablica2));
        System.out.println(sum28(tablica3));

    }
    public static boolean sum28(int[] nums) {
        int sum = 0;
        for(int element : nums){
            if(element==2){
                sum = sum + 2;
            }
        }
        return sum==8;
    }

}
