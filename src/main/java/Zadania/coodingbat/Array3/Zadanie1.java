package Zadania.coodingbat.Array3;


/*Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive.
A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
Rozważmy skrajne lewe i prawe wystąpienie pewnej wartości w tablicy. Powiemy, że „rozpiętość” to liczba elementów pomiędzy nimi włącznie.
Pojedyncza wartość ma zakres 1. Zwraca największy zakres znaleziony w danej tablicy.
        maxSpan([1, 2, 1, 1, 3]) → 4
        maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
        maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6*/

public class Zadanie1 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 1, 1, 3};
        int[] tablica2 = {1, 4, 2, 1, 4, 1, 4};
        int[] tablica3 = {1, 4, 2, 1, 4, 4, 4};

        System.out.println(maxSpan(tablica1));
        System.out.println(maxSpan(tablica2));
        System.out.println(maxSpan(tablica3));

    }
    public static int maxSpan(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        if(nums.length==2 && nums[0]!=nums[1]){
            return 1;
        }
        int max = 0;
        for(int i=0; i<nums.length;i++){
            for(int j=nums.length-1; j>i; j--){
                if(nums[i]==nums[j]){
                    if(j-i+1>max){
                        max=j-i+1;
                    }
                    break;
                }
            }
        }
        return max;
    }


}
