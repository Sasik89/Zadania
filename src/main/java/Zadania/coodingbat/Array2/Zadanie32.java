package Zadania.coodingbat.Array2;

import java.util.ArrayList;
import java.util.List;

/*Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
Zwraca tablicę zawierającą dokładnie te same liczby, co podana tablica, ale uporządkowaną tak, aby wszystkie liczby parzyste znajdowały się przed wszystkimi liczbami nieparzystymi.
Poza tym liczby mogą być w dowolnej kolejności. Możesz zmodyfikować i zwrócić podaną tablicę lub utworzyć nową tablicę.
        evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
        evenOdd([3, 3, 2]) → [2, 3, 3]
        evenOdd([2, 2, 2]) → [2, 2, 2]*/
public class Zadanie32 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 0, 1, 0, 0, 1, 1};
        int[] tablica2 = {3, 3, };
        int[] tablica3 = {2, 2, 2};

        wyswietlacz(evenOdd(tablica1));
        wyswietlacz(evenOdd(tablica2));
        wyswietlacz(evenOdd(tablica3));

    }
    public static int[] evenOdd(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i< nums.length;i++){
            if(nums[i]%2==0){
                result.add(nums[i]);
            }
        }
        for(int i=0; i< nums.length;i++){
            if(nums[i]%2!=0){
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
