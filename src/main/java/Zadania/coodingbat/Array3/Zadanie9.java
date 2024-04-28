package Zadania.coodingbat.Array3;

/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
Załóżmy, że „grupa” w tablicy to seria 2 lub więcej sąsiadujących elementów o tej samej wartości. Zwraca liczbę skupień w podanej tablicy.
        countClumps([1, 2, 2, 3, 4, 4]) → 2
        countClumps([1, 1, 2, 1, 1]) → 2
        countClumps([1, 1, 1, 1, 1]) → 1*/

public class Zadanie9 {

    // TODO: 28.04.2024 Działa 
    
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 2, 3, 4, 4};
        int[] tablica2 = {1, 1, 2, 1, 1};
        int[] tablica3 = {1, 1, 1, 1, 1};

        System.out.println(countClumps(tablica1));
        System.out.println(countClumps(tablica2));
        System.out.println(countClumps(tablica3));

    }

    public static int countClumps(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                while (true) {
                    if (nums[i] == nums[i + 1] && i<nums.length-2) {
                        i++;
                    } else {
                        counter++;
                        break;
                    }
                }
            } else {
            }
        }
        return counter;
    }

}
