package Zadania.coodingbat.Array2;


/*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
        has22([1, 2, 2]) → true
        has22([1, 2, 1, 2]) → false
        has22([2, 1, 2]) → false*/

public class Zadanie6 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 2};
        int[] tablica2 = {1, 2, 1, 2};
        int[] tablica3 = {2, 1, 2};

        System.out.println(has22(tablica1));
        System.out.println(has22(tablica2));
        System.out.println(has22(tablica3));

    }
    public static boolean has22(int[] nums) {
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]==2 && nums[i+1]==2){
                return true;
            }
        }
        return false;
    }


}
