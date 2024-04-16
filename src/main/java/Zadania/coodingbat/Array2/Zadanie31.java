package Zadania.coodingbat.Array2;


/*Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
If there is no odd value to the right of the zero, leave the zero as a zero.
Zwraca wersję danej tablicy, w której każda wartość zerowa w tablicy jest zastępowana największą wartością nieparzystą na prawo od zera w tablicy.
Jeśli po prawej stronie zera nie ma wartości nieparzystej, pozostaw zero jako zero.
        zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
        zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
        zeroMax([0, 1, 0]) → [1, 1, 0]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie31 {
    public static void main(String[] args) {

        int[] tablica1 = {0, 5, 0, 3};
        int[] tablica2 = {0, 4, 0, 3};
        int[] tablica3 = {0, 1, 0};

        wyswietlacz(zeroMax(tablica1));
        wyswietlacz(zeroMax(tablica2));
        wyswietlacz(zeroMax(tablica3));

    }
    public static int[] zeroMax(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                int max = 0;
                for(int j=i; j<nums.length;j++){
                    if(nums[j]%2!=0 && nums[j]>max){
                        max=nums[j];
                    }
                }
                result.add(max);
            } else {
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
