package Zadania.coodingbat.Array1;

/*Given an int array, return a new array with double the length where its last element is the same as the original array,
and all the other elements are 0.
The original array will be length 1 or more.
Note: by default, a new int array contains all 0's.
        makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        makeLast([1, 2]) → [0, 0, 0, 2]
        makeLast([3]) → [0, 3]*/

public class Zadanie14 {
    public static void main(String[] args) {

        int[] tablica1 = {4, 5, 6};
        int[] tablica2 = {1, 2};
        int[] tablica3 = {3};

        wypisywacz(makeLast(tablica1));
        wypisywacz(makeLast(tablica2));
        wypisywacz(makeLast(tablica3));

    }
    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length*2];
        for(int i=0; i<nums.length*2;i++){
            result[i]=0;
        }
        result[nums.length*2-1] = nums[nums.length-1];
        return result;
    }

    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
