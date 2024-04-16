package Zadania.coodingbat.Array2;


/*Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array.
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
        pre4([1, 2, 4, 1]) → [1, 2]
        pre4([3, 1, 4]) → [3, 1]
        pre4([1, 4, 4]) → [1]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie26 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 4, 1};
        int[] tablica2 = {3, 1, 4};
        int[] tablica3 = {1, 4, 4};

        wyswietlacz(pre4(tablica1));
        wyswietlacz(pre4(tablica2));
        wyswietlacz(pre4(tablica3));

    }
    public static int[] pre4(int[] nums) {
        List<Integer> result = new ArrayList<>();
            for(int element : nums){
                if(element!=4){
                    result.add(element);
                } else {
                    break;
                }
            }
            return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void wyswietlacz(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
