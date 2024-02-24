package Zadania.coodingbat.warmup2;

/*Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1.
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
Biorąc pod uwagę tablicę int, zwróć wartość true, jeśli zawiera wzorzec 2, 7, 1: wartość, po której następuje wartość plus 5, po której następuje wartość minus 1.
Dodatkowo liczba 271 liczy się, nawet jeśli „1” różni się o 2 lub mniej od prawidłowej wartości.

        has271([1, 2, 7, 1]) → true
        has271([1, 2, 8, 1]) → false
        has271([2, 7, 1]) → true*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie17 {
    public static void main(String[] args) {

        int[] lista1 = {1, 2, 7, 1};
        int[] lista2 = {1, 2, 8, 1};
        int[] lista3 = {2, 7, 1};

        System.out.println(has271(lista1));
        System.out.println(has271(lista2));
        System.out.println(has271(lista3));

    }
    public static boolean has271(int[] nums) {
        List<Integer> lista = new ArrayList<>();
        for (int value : nums) {
            lista.add(value);
        }
        if(!lista.contains(7)){
            return false;
        }
        int liczba7 = lista.indexOf(7);
        return nums[liczba7 - 1] <= 3 || nums[liczba7 - 1] >= -1 && nums[liczba7] == 7 && nums[liczba7 + 1] == 1;
    }

}
