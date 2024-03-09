/*

Given an array of ints, return true if the array contains no 1's and no 3's.
Biorąc pod uwagę tablicę int, zwróć true, jeśli tablica nie zawiera 1 ani 3.

        lucky13([0, 2, 4]) → true
        lucky13([1, 2, 3]) → false
        lucky13([1, 2, 4]) → false
*/

//https://codingbat.com/prob/p194525

package Zadania.coodingbat.mieszane;

public class Zadanie6 {

    // TODO: 13.01.2024 Działa 
    
    public static void main(String[] args) {

    int[] tablica1 = {0,2,4};
    int[] tablica2 = {1,2,3};
    int[] tablica3 = {1,2,3};

    System.out.println(lucky13(tablica1));
    System.out.println(lucky13(tablica2));
    System.out.println(lucky13(tablica3));

    }

    public static boolean lucky13(int[] tablica){
        int counter = 0;
        for(int entry : tablica ){
            if(entry == 1 || entry == 3){
                counter++;
            }
        }
        return counter == 0;
    }
}
