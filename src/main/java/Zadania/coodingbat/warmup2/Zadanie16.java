package Zadania.coodingbat.warmup2;

/*Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
Mając tablicę int, powiemy, że triple to wartość występująca w tablicy 3 razy z rzędu. Zwróć wartość true, jeśli tablica nie zawiera żadnych trójek.

        noTriples([1, 1, 2, 2, 1]) → true
        noTriples([1, 1, 2, 2, 2, 1]) → false
        noTriples([1, 1, 1, 2, 2, 2, 1]) → false*/

public class Zadanie16 {
    public static void main(String[] args) {

        int[] lista1 = {1, 1, 2, 2, 1};
        int[] lista2 = {1, 1, 2, 2, 2, 1};
        int[] lista3 = {1, 1, 1, 2, 2, 2, 1};

        System.out.println(noTriples(lista1));
        System.out.println(noTriples(lista2));
        System.out.println(noTriples(lista3));

    }
    public static boolean noTriples(int[] nums) {
        for(int i=0; i <  nums.length-2; i++){
            if((nums[i] == nums[i+1]) && nums[i+1] == nums[i+2]){
                return false;
            }
        }
        return true;
    }

}
