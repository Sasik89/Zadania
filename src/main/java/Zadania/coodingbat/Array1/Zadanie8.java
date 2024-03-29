package Zadania.coodingbat.Array1;


/*Given an array of ints length 3, figure out which is larger, the first or last element in the array,
 and set all the other elements to be that value. Return the changed array.
Biorąc pod uwagę tablicę o długości całkowitej 3, sprawdź, który element jest większy – pierwszy czy ostatni element tablicy,
i ustaw wszystkie pozostałe elementy na tę wartość. Zwróć zmienioną tablicę.

       maxEnd3([1, 2, 3]) → [3, 3, 3]
        maxEnd3([11, 5, 9]) → [11, 11, 11]
        maxEnd3([2, 11, 3]) → [3, 3, 3]*/

public class Zadanie8 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {11, 5, 9};
        int[] tablica3 = {2, 11, 3};

        wypisywacz(maxEnd3(tablica1));
        wypisywacz(maxEnd3(tablica2));
        wypisywacz(maxEnd3(tablica3));


    }
    public static int[] maxEnd3(int[] nums) {
        int[] result = new int[nums.length];
        if(nums[0]>=nums[2]){
            for (int i=0;i<nums.length;i++){
                result[i] = nums[0];
            }
        }
        if(nums[2]>nums[0]){
            for (int i=0;i<nums.length;i++){
                result[i] = nums[2];
            }
        }
        return result;
    }
    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
