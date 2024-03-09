package Zadania.coodingbat.Array1;

/*Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
        plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
        plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
        plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]*/

import java.util.ArrayList;

public class Zadanie20 {
    public static void main(String[] args) {

        int[] tablica1 = {1, 2};
        int[] tablica1a = {3, 4};
        int[] tablica2 = {4, 4};
        int[] tablica2a = {2, 2};
        int[] tablica3 = {9, 2};
        int[] tablica3a = {3, 4};

        wypisywacz(plusTwo(tablica1,tablica1a));
        wypisywacz(plusTwo(tablica2,tablica2a));
        wypisywacz(plusTwo(tablica3,tablica3a));

    }
    public static int[] plusTwo(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int element : a){
            result.add(element);
        }
        for(int element : b){
            result.add(element);
        }
        int[] wynik = new int[a.length+b.length];
        for(int i=0;i<a.length+b.length;i++){
            wynik[i] = result.get(i);
        }
        return wynik;
    }

    public static void wypisywacz(int[] tablica){
        for(int element : tablica){
            System.out.print(element + " ");
        }
        System.out.println();
    }


}
