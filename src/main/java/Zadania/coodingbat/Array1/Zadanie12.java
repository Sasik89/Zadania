package Zadania.coodingbat.Array1;


/*Given an int array length 2, return true if it contains a 2 or a 3.
        has23([2, 5]) → true
        has23([4, 3]) → true
        has23([4, 5]) → false*/

public class Zadanie12 {
    public static void main(String[] args) {

        int[] tablica1 = {2, 5};
        int[] tablica2 = {4, 3};
        int[] tablica3 = {4, 5};

        System.out.println(has23(tablica1));
        System.out.println(has23(tablica2));
        System.out.println(has23(tablica3));

    }
    public static boolean has23(int[] nums) {
        for(int num : nums){
            if(num==2 || num==3){
                return true;
            }
        }
        return false;
    }

}
