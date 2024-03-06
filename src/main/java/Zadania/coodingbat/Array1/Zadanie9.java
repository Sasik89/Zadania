package Zadania.coodingbat.Array1;

/*Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
        sum2([1, 2, 3]) → 3
        sum2([1, 1]) → 2
        sum2([1, 1, 1, 1]) → 2*/

public class Zadanie9 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {1, 1};
        int[] tablica3 = {1, 1, 1, 1};

        System.out.println(sum2(tablica1));
        System.out.println(sum2(tablica2));
        System.out.println(sum2(tablica3));

    }
    public static int sum2(int[] nums) {
        if (nums.length==1) {
            return nums[0];
        } else if (nums.length>=2) {
            for(int i=0; i<2;i++){
                return nums[0]+nums[1];
            }
        }
        return 0;
    }
}
