package Zadania.coodingbat.Array2;

/*We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value.
Return true if the given value is everywhere in the array.
Powiemy, że wartość występuje „wszędzie” w tablicy, jeśli dla każdej pary sąsiednich elementów w tablicy co najmniej jeden z tej pary jest tą wartością.
Zwraca wartość true, jeśli podana wartość znajduje się w dowolnym miejscu tablicy.
        isEverywhere([1, 2, 1, 3], 1) → true
        isEverywhere([1, 2, 1, 3], 2) → false
        isEverywhere([1, 2, 1, 3, 4], 1) → false*/

public class Zadanie13 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 1, 3};
        int[] tablica2 = {1, 2, 1, 3};
        int[] tablica3 = {1, 2, 1, 3, 4};

        System.out.println(isEverywhere(tablica1,1));
        System.out.println(isEverywhere(tablica2,2));
        System.out.println(isEverywhere(tablica3,1));

    }
    public static boolean isEverywhere(int[] nums, int val) {
        boolean result = false;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i]==val || nums[i+1]==val){
                result=true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }


}
