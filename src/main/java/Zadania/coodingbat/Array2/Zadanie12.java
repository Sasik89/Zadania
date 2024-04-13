package Zadania.coodingbat.Array2;

/*Given an array of ints, return true if it contains no 1's or it contains no 4's.
        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true*/

public class Zadanie12 {
    public static void main(String[] args) {


        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {1, 2, 3, 4};
        int[] tablica3 = {2, 3, 4};

        System.out.println(no14(tablica1));
        System.out.println(no14(tablica2));
        System.out.println(no14(tablica3));

    }
    public static boolean no14(int[] nums) {
        boolean hasone = true;
        boolean hasfour = true;
        for(int element: nums ){
            if(element==1){
                hasone = false;
            }
            if(element==3){
                hasfour = false;
            }
        }
        if(hasone || hasfour){
            return true;
        } else {
            return false;
        }
    }



}
