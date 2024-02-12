/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array.
The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

Zwróć tablicę zawierającą dokładnie takie same liczby jak podana tablica, ale zmienioną tak, aby wszystkie zera były zgrupowane na początku tablicy.
Kolejność liczb niezerowych nie ma znaczenia. Zatem {1, 0, 0, 1} staje się {0 ,0, 1, 1}. Możesz zmodyfikować i zwrócić podaną tablicę lub utworzyć nową tablicę.


        zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
        zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
        zeroFront([1, 0]) → [0, 1]
*/

package Zadania.coodingbat;

import java.util.ArrayList;
import java.util.List;

public class Zadanie8 {

    // TODO: 13.01.2024 Działa 

    public static void main(String[] args) {
        int[] tablica1 = {1,0,0,1};
        int[] tablica2 = {0,1,1,0,1};
        int[] tablica3 = {1,0};

        System.out.println(zeroFront(tablica1));
        System.out.println(zeroFront(tablica2));
        System.out.println(zeroFront(tablica3));

    }

    public static List<Integer> zeroFront(int[] tablica){
        List<Integer> zeroNumbers = new ArrayList<>();
        List<Integer> elseNumbers = new ArrayList<>();
        for (int element : tablica) {
            if(element == 0){
                zeroNumbers.add(element);
            } else {
                elseNumbers.add(element);
            }
        }
        zeroNumbers.addAll(elseNumbers);
        return zeroNumbers;
    }

}
