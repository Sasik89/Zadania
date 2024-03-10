package Zadania.coodingbat.Array1;

/*Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
        frontPiece([1, 2, 3]) → [1, 2]
        frontPiece([1, 2]) → [1, 2]
        frontPiece([1]) → [1]*/

public class Zadanie24 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {1, 2};
        int[] tablica3 = {1};

        wypisywacz(frontPiece(tablica1));
        wypisywacz(frontPiece(tablica2));
        wypisywacz(frontPiece(tablica3));

    }
    public static int[] frontPiece(int[] nums) {
        if(nums.length<=1){
            return nums;
        } else{
            return new int[]{nums[0], nums[1]};
        }
    }
    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
