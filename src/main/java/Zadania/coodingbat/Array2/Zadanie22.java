package Zadania.coodingbat.Array2;


/*Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
        tripleUp([1, 4, 5, 6, 2]) → true
        tripleUp([1, 2, 3]) → true
        tripleUp([1, 2, 4]) → false*/

public class Zadanie22 {
    public static void main(String[] args) {


        int[] tablica1 = {1, 4, 5, 6, 2};
        int[] tablica2 = {1, 2, 3};
        int[] tablica3 = {1, 2, 4};

        System.out.println(tripleUp(tablica1));
        System.out.println(tripleUp(tablica2));
        System.out.println(tripleUp(tablica3));

    }
    public static boolean tripleUp(int[] nums) {
        for(int i = 0; i<nums.length-2;i++){
            if(nums[i+2]-nums[i+1]==1 && nums[i+1]-nums[i]==1){
                return true;
            }
        }
        return false;
    }

}
