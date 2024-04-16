package Zadania.coodingbat.Array2;


/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
        shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
        shiftLeft([1, 2]) → [2, 1]
        shiftLeft([1]) → [1]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie24 {
    public static void main(String[] args) {

        int[] tablica1 = {6, 2, 5, 3};
        int[] tablica2 = {1, 2};
        int[] tablica3 = {1};

        wyswietlacz(shiftLeft(tablica1));
        wyswietlacz(shiftLeft(tablica2));
        wyswietlacz(shiftLeft(tablica3));


    }

    public static int[] shiftLeft(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        if (nums.length == 1) {
            return nums;
        }
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                arr.add(nums[i]);
            }
            arr.add(nums[0]);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void wyswietlacz(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
