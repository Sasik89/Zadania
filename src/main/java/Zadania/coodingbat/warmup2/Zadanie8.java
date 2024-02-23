package Zadania.coodingbat.warmup2;


/*Given an array of ints, return the number of 9's in the array.
        arrayCount9([1, 2, 9]) → 1
        arrayCount9([1, 9, 9]) → 2
        arrayCount9([1, 9, 9, 3, 9]) → 3*/

public class Zadanie8 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 9};
        int[] tablica2 = {1, 9, 9};
        int[] tablica3 = {1, 2,9};


        System.out.println(arrayCount9(tablica1));
        System.out.println(arrayCount9(tablica2));
        System.out.println(arrayCount9(tablica3));

    }
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for(int element : nums){
            if(element==9){
                count++;
            }
        }
        return count;
    }

}
