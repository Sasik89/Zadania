package Zadania.coodingbat.Array1;

/*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
Powiemy, że 1, po której bezpośrednio następuje 3 w tablicy, to „pechowa” 1.
Zwraca wartość true, jeśli podana tablica zawiera pechową 1 na pierwszych 2 lub ostatnich 2 pozycjach tablicy.
        unlucky1([1, 3, 4, 5]) → true
        unlucky1([2, 1, 3, 4, 5]) → true
        unlucky1([1, 1, 1]) → false*/

public class Zadanie25 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 3, 4, 5};
        int[] tablica2 = {2, 1, 3, 4, 5};
        int[] tablica3 = {1, 1, 1};

        System.out.println(unlucky1(tablica1));
        System.out.println(unlucky1(tablica2));
        System.out.println(unlucky1(tablica3));

    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length >= 2 && (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3)) {
            return true;
        }
        if (nums.length >= 3 && (nums[1] == 1 && nums[2] == 3 || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
            return true;
        }
        return false;
    }
}