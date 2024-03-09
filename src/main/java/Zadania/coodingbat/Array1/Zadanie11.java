package Zadania.coodingbat.Array1;


/*Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
The original array will be length 1 or more.
makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]*/

public class Zadanie11 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {1, 2, 3, 4};
        int[] tablica3 = {7, 4, 6, 2};

        wypisywacz(makeEnds(tablica1));
        wypisywacz(makeEnds(tablica2));
        wypisywacz(makeEnds(tablica3));

    }
    public static int[] makeEnds(int[] nums) {
       if (nums.length>1) {
            int[] tablica = new int[2];
            tablica[0]=nums[0];
            tablica[1]=nums[nums.length-1];
            return tablica;
        }
        return new int[]{nums[0], nums[0]};
    }
    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
    }
}
