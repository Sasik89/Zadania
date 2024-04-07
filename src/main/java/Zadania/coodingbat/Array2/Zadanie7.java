package Zadania.coodingbat.Array2;

/*Given an array of ints, return true if the array contains no 1's and no 3's.
        lucky13([0, 2, 4]) → true
        lucky13([1, 2, 3]) → false
        lucky13([1, 2, 4]) → false*/

public class Zadanie7 {
    public static void main(String[] args) {


        int[] tablica1 = {0, 2, 4};
        int[] tablica2 = {1, 2, 3};
        int[] tablica3 = {1, 2, 4};
        int[] tablica4 = {2, 2};

        System.out.println(lucky13(tablica1));
        System.out.println(lucky13(tablica2));
        System.out.println(lucky13(tablica3));
        System.out.println(lucky13(tablica4));


    }
    public static boolean lucky13(int[] nums) {
        boolean hasone = true;
        boolean hasthree = true;
        for(int element: nums ){
            if(element==1){
                hasone = false;
            }
            if(element==3){
                hasthree = false;
            }
        }
        if(hasone && hasthree){
            return true;
        } else {
            return false;
        }
    }
}
