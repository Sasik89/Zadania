package Zadania.coodingbat.warmup2;

/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
        array123([1, 1, 2, 3, 1]) → true
        array123([1, 1, 2, 4, 1]) → false
        array123([1, 1, 2, 1, 2, 3]) → true*/

public class Zadanie10 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 1, 2, 3, 1};
        int[] tablica2 = {1, 1, 2, 4, 1};
        int[] tablica3 = {1, 1, 2, 1, 2, 3};

        System.out.println(array123(tablica1));
        System.out.println(array123(tablica2));
        System.out.println(array123(tablica3));

    }
    public static boolean array123(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
                return true;
            }
        }
        return false;
    }

}
