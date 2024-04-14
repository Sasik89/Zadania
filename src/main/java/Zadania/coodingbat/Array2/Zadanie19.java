package Zadania.coodingbat.Array2;

/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
Mając tablicę liczb typu int, zwróć wartość true, jeśli wartość 3 pojawi się w tablicy dokładnie 3 razy i żadne trójki nie znajdują się obok siebie.
        haveThree([3, 1, 3, 1, 3]) → true
        haveThree([3, 1, 3, 3]) → false
        haveThree([3, 4, 3, 3, 4]) → false*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie19 {
    public static void main(String[] args) {

        int[] tablica1 = {3, 1, 3, 1, 3};
        int[] tablica2 = {3, 1, 3, 3};
        int[] tablica3 = {3, 4, 3, 3, 4};

        System.out.println(haveThree(tablica1));
        System.out.println(haveThree(tablica2));
        System.out.println(haveThree(tablica3));

    }

    public static boolean haveThree(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int count = (int) Arrays.stream(nums).filter(i -> i == 3).count();
        if(count!=3){
            return false;
        }
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==3){
                result.add(i);
            }
        }
        if(result.get(1)-result.get(0)>1 && result.get(2)-result.get(1)>1){
            return true;
        }
        return false;
    }
}
