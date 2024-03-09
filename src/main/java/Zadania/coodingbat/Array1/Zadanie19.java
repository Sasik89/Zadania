package Zadania.coodingbat.Array1;


/*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
 The original array will be length 2 or more.
        makeMiddle([1, 2, 3, 4]) → [2, 3]
        makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
        makeMiddle([1, 2]) → [1, 2]*/

public class Zadanie19 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3, 4};
        int[] tablica2 = {7, 1, 2, 3, 4, 9};
        int[] tablica3 = {1, 2};

        wypisywacz(makeMiddle(tablica1));
        wypisywacz(makeMiddle(tablica2));
        wypisywacz(makeMiddle(tablica3));

    }
    public static int[] makeMiddle(int[] nums) {
      if (nums.length>2) {
            return new int[]{nums[nums.length/2-1],nums[nums.length/2]};
        }
      return nums;
    }
    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
