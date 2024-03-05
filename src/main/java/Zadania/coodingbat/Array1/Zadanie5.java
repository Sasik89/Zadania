package Zadania.coodingbat.Array1;


/*Given an array of ints length 3, return the sum of all the elements.
        sum3([1, 2, 3]) → 6
        sum3([5, 11, 2]) → 18
        sum3([7, 0, 0]) → 7*/

public class Zadanie5 {
    public static void main(String[] args) {



    }
    public int sum3(int[] nums) {
        int sum = 0;
        for(int element : nums){
            sum = element + sum;
        }
        return sum;
    }
}

