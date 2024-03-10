package Zadania.coodingbat.Array1;

/*Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
        rotateLeft3([1, 2, 3]) → [2, 3, 1]
        rotateLeft3([5, 11, 9]) → [11, 9, 5]
        rotateLeft3([7, 0, 0]) → [0, 0, 7]*/

public class Zadanie6 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {5, 11, 9};
        int[] tablica3 = {7, 0, 0};

        wypisywacz(rotateLeft3(tablica1));
        wypisywacz(rotateLeft3(tablica2));
        wypisywacz(rotateLeft3(tablica3));


    }
    public static int[] rotateLeft3(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[1];
        result[1] = nums[2];
        result[2] = nums[0];
        return result;
    }
    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
