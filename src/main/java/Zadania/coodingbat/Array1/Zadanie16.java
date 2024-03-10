package Zadania.coodingbat.Array1;

/*Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
        fix23([1, 2, 3]) → [1, 2, 0]
        fix23([2, 3, 5]) → [2, 0, 5]
        fix23([1, 2, 1]) → [1, 2, 1]*/

public class Zadanie16 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {2, 3, 5};
        int[] tablica3 = {1, 2, 1};

        wypisywacz(fix23(tablica1));
        wypisywacz(fix23(tablica2));
        wypisywacz(fix23(tablica3));

    }
    public static int[] fix23(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==2 && nums[i+1]==3){
                nums[i+1]=0;
                return nums;
            }
        }
        return nums;
    }
    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
