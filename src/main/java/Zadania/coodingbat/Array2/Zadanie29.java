package Zadania.coodingbat.Array2;


/*Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array.
The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
Zwraca tablicę zawierającą dokładnie te same liczby, co podana tablica, ale uporządkowaną w taki sposób, aby wszystkie zera były zgrupowane na początku tablicy.
Kolejność liczb niezerowych nie ma znaczenia. Zatem {1, 0, 0, 1} staje się {0,0, 1, 1}. Możesz zmodyfikować i zwrócić podaną tablicę lub utworzyć nową tablicę.
        zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
        zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
        zeroFront([1, 0]) → [0, 1]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie29 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 0, 0, 1};
        int[] tablica2 = {0, 1, 1, 0, 1};
        int[] tablica3 = {1, 0};

        wyswietlacz(zeroFront(tablica1));
        wyswietlacz(zeroFront(tablica2));
        wyswietlacz(zeroFront(tablica3));

    }
    public static int[] zeroFront(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i< nums.length;i++){
            if(nums[i]==0){
                result.add(nums[i]);
            }
        }
        for(int i=0; i< nums.length;i++){
            if(nums[i]!=0){
                result.add(nums[i]);
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
