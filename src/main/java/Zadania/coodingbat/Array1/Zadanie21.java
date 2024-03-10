package Zadania.coodingbat.Array1;

/*Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
        swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
        swapEnds([1, 2, 3]) → [3, 2, 1]
        swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie21 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3, 4};
        int[] tablica2 = {1, 2, 3};
        int[] tablica3 = {8, 6, 7, 9, 5};

    }
    public static int[] swapEnds(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums.length<=1){
            return nums;
        } else {
            result.add(nums[nums.length-1]);
        for(int i=1;i<nums.length-1;i++){
            result.add(nums[i]);
        }
        result.add(nums[0]);
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = result.get(i);
        }
            return arr;
        }
    }
}
