package Zadania.coodingbat.Array1;

/*Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3.
        midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
        midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
        midThree([1, 2, 3]) → [1, 2, 3]*/

public class Zadanie22 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3, 4, 5};
        int[] tablica2 = {8, 6, 7, 5, 3, 0, 9};
        int[] tablica3 = {1, 2, 3};

        wypisywacz(midThree(tablica1));
        wypisywacz(midThree(tablica2));
        wypisywacz(midThree(tablica3));

    }
    public static int[] midThree(int[] nums) {
        if (nums.length>3) {
            return new int[]{nums[(nums.length/2)-1], nums[(nums.length/2)], nums[(nums.length/2)+1]};
        } else{
        return nums;
    }
    }
    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
