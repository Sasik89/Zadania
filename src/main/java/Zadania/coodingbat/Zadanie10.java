/*
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array,
 but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move.
 The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

Zwróć tablicę zawierającą dokładnie te same liczby, co podana tablica,
ale przestawione tak, aby po każdej 4 bezpośrednio następowała 5. Nie przesuwaj 4, ale każda inna liczba może zostać przesunięta.
Tablica zawiera tę samą liczbę cyfr 4 i 5, a po każdej 4 znajduje się liczba inna niż 4.
W tej wersji cyfry 5 mogą pojawić się w dowolnym miejscu oryginalnej tablicy.

        fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
        fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
        fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]*/

package Zadania.coodingbat;

import java.util.ArrayList;
import java.util.List;

//TODO nie działa

public class Zadanie10 {
    public static void main(String[] args) {

        int[] lista1 = {5, 4, 9, 4, 9, 5};
        int[] lista2 = {1, 4, 1, 5};
        int[] lista3 = {1, 4, 1, 5, 5, 4, 1};

        fix45(lista1);
        fix45(lista2);
        fix45(lista3);


    }



    public static void fix45(int[] tablica){
        List<Integer> lista5 = new ArrayList<>();
        List<Integer> lista4 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int counter5 = 0;
        for(int i = 0; i<tablica.length; i++){
            if(tablica[i] == 4){
                lista4.add(i);
            } if(tablica[i] == 5){
                lista5.add(i);
                counter5++;
            }

        }
        for (int i=0;i<tablica.length;i++){
            if(tablica[i] == 4 && tablica[i+1] !=5){
                result.add(tablica[i]);
                result.add(tablica[i+1]);
            }
        }
        System.out.println(counter5);
        System.out.println(lista4);
        System.out.println(lista5);





    }

}
