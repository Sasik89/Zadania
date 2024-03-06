package Zadania.coodingbat.Array1;

/*Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
        reverse3([1, 2, 3]) → [3, 2, 1]
        reverse3([5, 11, 9]) → [9, 11, 5]
        reverse3([7, 0, 0]) → [0, 0, 7]*/

public class Zadanie7 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {5, 11, 9};
        int[] tablica3 = {7, 0, 0};

        System.out.println(reverse3(tablica1));
        System.out.println(reverse3(tablica2));
        System.out.println(reverse3(tablica3));

    }
    public static int[] reverse3(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            int j = Math.abs(i-2);
            result[j]=nums[i];
        }
        return result;
    }

}
