package Zadania.coodingbat.Array1;


/*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true*/

public class Zadanie4 {
    public static void main(String[] args) {

        int[] tablica1 = {1,2,3};
        int[] tablica2 = {7,3};
        int[] tablica3 = {7, 3, 2};
        int[] tablica4 = {1, 3};

        System.out.println(commonEnd(tablica1,tablica2));
        System.out.println(commonEnd(tablica1,tablica3));
        System.out.println(commonEnd(tablica1,tablica4));


    }
    public static boolean commonEnd(int[] a, int[] b) {
        if(a[0]==b[0] || a[a.length-1]==b[b.length-1]){
            return true;
        }
        return false;
    }

}
