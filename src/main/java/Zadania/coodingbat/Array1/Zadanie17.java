package Zadania.coodingbat.Array1;

/*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
        start1([1, 2, 3], [1, 3]) → 2
        start1([7, 2, 3], [1]) → 1
        start1([1, 2], []) → 1*/

public class Zadanie17 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica1a = {1,2};
        int[] tablica2 = {7, 2, 3};
        int[] tablica2a = {1};
        int[] tablica3 = {1, 2};
        int[] tablica3a = {};

        System.out.println(start1(tablica1,tablica1a));
        System.out.println(start1(tablica2,tablica2a));
        System.out.println(start1(tablica3,tablica3a));

    }
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if(a.length >0 && a[0]==1){
            count++;
        } if(b.length >0 && b[0]==1){
            count++;
        }
        return count;
    }

}
