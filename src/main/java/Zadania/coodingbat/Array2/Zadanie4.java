package Zadania.coodingbat.Array2;


/*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
        sum13([1, 2, 2, 1]) → 6
        sum13([1, 1]) → 2
        sum13([1, 2, 2, 1, 13]) → 6*/

public class Zadanie4 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 2, 1};
        int[] tablica2 = {1, 1};
        int[] tablica3 = {1, 2, 2, 1, 13};

        System.out.println(sum13(tablica1));
        System.out.println(sum13(tablica2));
        System.out.println(sum13(tablica3));


    }

    public static int sum13(int[] nums) {
        int sum = 0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==13){
                sum = sum + 0;
                i++;
            } else {
                sum = sum + nums[i];
            }
        }
        return sum;
    }


}
