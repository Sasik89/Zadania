package Zadania.coodingbat.Array1;

/*Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
        double23([2, 2]) → true
        double23([3, 3]) → true
        double23([2, 3]) → false*/

public class Zadanie15 {
    public static void main(String[] args) {

        int[] tablica1 = {2,2};
        int[] tablica2 = {3,3};
        int[] tablica3 = {2,3};

        System.out.println(double23(tablica1));
        System.out.println(double23(tablica2));
        System.out.println(double23(tablica3));

    }
    public static boolean double23(int[] nums) {
        if(nums.length<2){
            return false;
        } else if ((nums[0]==2 && nums[1]==2) || (nums[0]==3 && nums[1]==3)) {
            return true;
        }
        return false;
    }
}
