package Zadania.coodingbat.app1;

/*

Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
        The original array will contain at least "count" even numbers.
        copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
        copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
        copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie10 {
    public static void main(String[] args) {

        int[] tablica1 = {3, 2, 4, 5, 8};
        int[] tablica2 = {3, 2, 4, 5, 8};
        int[] tablica3 = {6, 1, 2, 4, 5, 8};

        wyswietlacz(copyEvens(tablica1,2));
        wyswietlacz(copyEvens(tablica2,3));
        wyswietlacz(copyEvens(tablica3,3));

    }
    public static int[] copyEvens(int[] nums, int count) {
        List<Integer> result = new ArrayList<>();
        int counter = 1;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]%2==0 && counter<=count){
                result.add(nums[i]);
                counter++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void wyswietlacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
