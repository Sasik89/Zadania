package Zadania.coodingbat.warmup2;


/*Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
        arrayFront9([1, 2, 9, 3, 4]) → true
        arrayFront9([1, 2, 3, 4, 9]) → false
        arrayFront9([1, 2, 3, 4, 5]) → false*/

public class Zadanie9 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 9, 3, 4};
        int[] tablica2 = {1, 2, 3, 4, 9};
        int[] tablica3 = {1, 2, 3, 4, 5};

        System.out.println(arrayFront9(tablica1));
        System.out.println(arrayFront9(tablica2));
        System.out.println(arrayFront9(tablica3));

    }

    public static boolean arrayFront9(int[] nums) {
        int lenght = 0;
        if(nums.length>4){
            lenght=4;
        } else {
            lenght=nums.length;
        }
        for(int i=0; i<lenght;i++){
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }
}
