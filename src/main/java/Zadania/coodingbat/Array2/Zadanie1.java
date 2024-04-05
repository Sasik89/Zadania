package Zadania.coodingbat.Array2;


/*Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0*/

public class Zadanie1 {
    public static void main(String[] args) {

        int[] tablica1 = {2, 1, 2, 3, 4};
        int[] tablica2 = {2, 2, 0};
        int[] tablica3 = {1, 3, 5};


        System.out.println(countEvens(tablica1));
        System.out.println(countEvens(tablica2));
        System.out.println(countEvens(tablica3));


    }
    public static int countEvens(int[] nums) {
        int counter = 0;
        for(int element : nums){
            if(element%2==0){
                counter++;
            }
        }
        return counter;
    }
}
