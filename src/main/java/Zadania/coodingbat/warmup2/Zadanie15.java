package Zadania.coodingbat.warmup2;

/*Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
Biorąc pod uwagę tablicę liczb typu int, zwróć liczbę przypadków, w których dwie cyfry 6 znajdują się obok siebie w tablicy.
Policz także przypadki, w których druga „6” to w rzeczywistości 7.

        array667([6, 6, 2]) → 1
        array667([6, 6, 2, 6]) → 1
        array667([6, 7, 2, 6]) → 1*/

public class Zadanie15 {
    public static void main(String[] args) {

        int[] lista1 = {6,6,2};
        int[] lista2 = {6, 6, 2, 6};
        int[] lista3 = {6, 7, 2, 6};

        System.out.println(array667(lista1));
        System.out.println(array667(lista2));
        System.out.println(array667(lista3));

    }
    public static int array667(int[] nums) {
        int counter = 0;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i] == 6 && nums[i+1] == 6 || nums[i] == 6 && nums[i+1] == 7){
                counter++;
            }
        }
        return counter;
    }
}
