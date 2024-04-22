package Zadania.coodingbat.Array3;


/*Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
Biorąc pod uwagę niepustą tablicę, zwróć wartość true, jeśli istnieje miejsce, w którym można podzielić tablicę w taki sposób, aby suma liczb po jednej stronie była równa sumie liczb po drugiej stronie.
        canBalance([1, 1, 1, 2, 1]) → true
        canBalance([2, 1, 1, 2, 1]) → false
        canBalance([10, 10]) → true*/

public class Zadanie4 {
    public static void main(String[] args) {

        // TODO: 23.04.2024 Działa 

        int[] tablica1 = {1, 1, 1, 2, 1};
        int[] tablica2 = {2, 1, 1, 2, 1};
        int[] tablica3 = {10, 10};

        System.out.println(canBalance(tablica1));
        System.out.println(canBalance(tablica2));
        System.out.println(canBalance(tablica3));

    }

    public static boolean canBalance(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int sumleft = 0;
        int sumright = 0;
        while (start <= end) {
            for (int i = 0; i <= start; i++) {
                sumleft = sumleft + nums[i];
            }
            start++;
            for (int j = end; j >= start; j--) {
                sumright = sumright + nums[j];
            }
            if (sumleft == sumright) {
                return true;
            } else {
                sumleft = 0;
                sumright = 0;
            }
        }
        return false;
    }


}
