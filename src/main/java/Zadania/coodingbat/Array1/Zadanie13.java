package Zadania.coodingbat.Array1;

/*Given an int array length 2, return true if it does not contain a 2 or 3.
        no23([4, 5]) → true
        no23([4, 2]) → false
        no23([3, 5]) → false*/

public class Zadanie13 {
    public static void main(String[] args) {

        int[] tablica1 = {2, 5};
        int[] tablica2 = {4, 3};
        int[] tablica3 = {4, 5};

        System.out.println(no23(tablica1));
        System.out.println(no23(tablica2));
        System.out.println(no23(tablica3));

    }
    public static boolean no23(int[] nums) {
        for(int num : nums){
            if(num==2 || num==3){
                return false;
            }
        }
        return true;
    }

    }
