/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

Zwróć tablicę zawierającą dokładnie takie same liczby jak podana tablica, ale uporządkowaną tak, aby wszystkie liczby parzyste znajdowały się przed wszystkimi liczbami nieparzystymi.
Poza tym liczby mogą być w dowolnej kolejności. Możesz zmodyfikować i zwrócić podaną tablicę lub utworzyć nową tablicę.

        evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
        evenOdd([3, 3, 2]) → [2, 3, 3]
        evenOdd([2, 2, 2]) → [2, 2, 2]
*/


package Zadania.coodingbat.mieszane;

import java.util.ArrayList;
import java.util.List;

public class Zadanie7 {

    // TODO: 13.01.2024 Działa 
    
    public static void main(String[] args) {

        int[] lista1 = {1,0,1,0,0,1,1};
        int[] lista2 = {3,3,2};
        int[] lista3 = {2,2,2};

        System.out.println(evenOdd(lista1));
        System.out.println(evenOdd(lista2));
        System.out.println(evenOdd(lista3));

    }

    public static List<Integer> evenOdd(int[] tablica){
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (int element : tablica) {
            if(element%2 == 0){
                evenNumbers.add(element);
            } else {
                oddNumbers.add(element);
            }

        }
        evenNumbers.addAll(oddNumbers);
        return evenNumbers;
    }

}
