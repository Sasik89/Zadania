package Zadania.coodingbat.Array2;


/*Given an array of ints, return true if every element is a 1 or a 4.
        only14([1, 4, 1, 4]) → true
        only14([1, 4, 2, 4]) → false
        only14([1, 1]) → true*/

public class Zadanie10 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 4, 1, 4};
        int[] tablica2 = {1, 4, 2, 4};
        int[] tablica3 = {1, 1};

        System.out.println(only14(tablica1));
        System.out.println(only14(tablica2));
        System.out.println(only14(tablica3));

    }
    public static boolean only14(int[] nums) {
        for(int element : nums){
            if(element != 1 & element !=4){
                return false;
            }
        }
        return true;
    }

}
