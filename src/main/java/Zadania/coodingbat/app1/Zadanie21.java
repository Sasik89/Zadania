package Zadania.coodingbat.app1;

/*Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
Return the count of the number of strings which appear in both arrays.
The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
Zacznij od dwóch tablic ciągów a i b, każdy w kolejności alfabetycznej, ewentualnie z duplikatami.
Zwraca liczbę ciągów występujących w obu tablicach.
Najlepsze rozwiązanie „liniowe” polega na pojedynczym przejściu przez obie tablice, wykorzystując fakt, że są one ułożone w kolejności alfabetycznej.
        commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
        commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
        commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie21 {
    public static void main(String[] args) {

        String[] tablica1 = {"a", "c", "x"};
        String[] tablica1a = {"b", "c", "d", "x"};
        String[] tablica2 = {"a", "c", "x"};
        String[] tablica2a = {"a", "b", "c", "x", "z"};
        String[] tablica3 = {"a", "b", "c"};
        String[] tablica3a = {"a", "b", "c"};

        System.out.println(commonTwo(tablica1,tablica1a));
        System.out.println(commonTwo(tablica2,tablica2a));
        System.out.println(commonTwo(tablica3,tablica3a));
    }
    public static int commonTwo(String[] a, String[] b) {
        List<String> result1 = new ArrayList<>(Arrays.asList(a));
        List<String> result2 = new ArrayList<>(Arrays.asList(b));
        List<String> result3 = new ArrayList<>();
        result3.addAll(result2);
        result3.addAll(result1);
        return (int) ((int) result1.stream().distinct().count()+result2.stream().distinct().count()-result3.stream().distinct().count());
    }

}
