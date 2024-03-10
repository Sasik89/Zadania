package Zadania.coodingbat.Array1;


/*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
        middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
        middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
        middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]*/

public class Zadanie10 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {4, 5, 6};
        int[] tablica3 = {7, 7, 7};
        int[] tablica4 = {3, 8, 0};
        int[] tablica5 = {5, 2, 9};
        int[] tablica6 = {1, 4, 5};

        wypisywacz(middleWay(tablica1,tablica2));
        wypisywacz(middleWay(tablica3,tablica4));
        wypisywacz(middleWay(tablica5,tablica6));

    }
    public static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }
    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
