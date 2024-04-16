package Zadania.coodingbat.Array2;


/*Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array.
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
        post4([2, 4, 1, 2]) → [1, 2]
        post4([4, 1, 4, 2]) → [2]
        post4([4, 4, 1, 2, 3]) → [1, 2, 3]*/

import java.util.Arrays;

public class Zadanie27 {
    public static void main(String[] args) {

        int[] tablica1 = {2, 4, 1, 2};
        int[] tablica2 = {4, 1, 4, 2};
        int[] tablica3 = {4, 4, 1, 2, 3};

        wyswietlacz(post4(tablica1));
        wyswietlacz(post4(tablica2));
        wyswietlacz(post4(tablica3));

    }
    public static int[] post4(int[] nums) {
        int lastfour = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i]==4){
                lastfour = i+1;
            }
        }
        return Arrays.stream(nums).skip(lastfour).toArray();
    }
    public static void wyswietlacz(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
