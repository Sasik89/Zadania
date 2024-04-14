package Zadania.coodingbat.Array2;

/*Given an array of ints, return true if every 2 that appears in the array is next to another 2.
Biorąc pod uwagę tablicę liczb całkowitych, zwróć wartość true, jeśli każde 2 pojawiające się w tablicy znajduje się obok kolejnej 2
        twoTwo([4, 2, 2, 3]) → true
        twoTwo([2, 2, 4]) → true
        twoTwo([2, 2, 4, 2]) → false*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie20 {
    public static void main(String[] args) {

        int[] tablica1 = {4, 2, 2, 3};
        int[] tablica2 = {2, 2, 4};
        int[] tablica3 = {2, 2, 4, 2};

        System.out.println(twoTwo(tablica1));
        System.out.println(twoTwo(tablica2));
        System.out.println(twoTwo(tablica3));
    }

    public static boolean twoTwo(int[] nums) {
        if ((int) Arrays.stream(nums).filter(i -> i == 2).count() < 1) {
            return true;
        }
        List<Integer> result = new ArrayList<>();
        boolean res = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                result.add(i);
            }
        }
        for (int i = 0; i < result.size() - 1; i++) {
            if (result.get(i + 1) - result.get(i) <= 1) {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }
}
