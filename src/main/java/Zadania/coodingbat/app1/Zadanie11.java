package Zadania.coodingbat.app1;

/*We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array.
Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.
Powiemy, że dodatni int n to „endy”, jeśli mieści się w zakresie 0..10 lub 90..100 (włącznie).
Biorąc pod uwagę tablicę dodatnich wartości całkowitych, zwróć nową tablicę o długości „count” zawierającą pierwsze liczby końcowe z oryginalnej tablicy.
Rozłóż osobną metodę isEndy(int n), aby sprawdzić, czy liczba jest skończona. Oryginalna tablica będzie zawierać co najmniej liczby końcowe „count”.
copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie11 {
    public static void main(String[] args) {

        int[] tablica1 = {9, 11, 90, 22, 6};
        int[] tablica2 = {9, 11, 90, 22, 6};
        int[] tablica3 = {12, 1, 1, 13, 0, 20};

        wyswietlacz(copyEndy(tablica1,2));
        wyswietlacz(copyEndy(tablica2,3));
        wyswietlacz(copyEndy(tablica3,2));

    }
    public static int[] copyEndy(int[] nums, int count) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for(int i = 0; i<nums.length;i++){
            if(((nums[i]>=0 && nums[i]<=10) || (nums[i]>=90 && nums[i]<=100)) && counter<count){
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
