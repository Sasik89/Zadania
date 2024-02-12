package Zadania.przykladoweZadaniaRekrutacyjne;

//Napisz algorytm sortowania przez wstawienie oraz posortuj strumieniem

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Zadanie5 {
    public static void main(String[] args) {

        int[] tablica1 = {3,4,8,3,9,4,2,4,6,8,9,2,1};
        int[] tablica2 = {20,43,11,7,4,2,88,44,0,1,5};
        int[] tablica3 = {1,2,4,3,1,1,1,};
        int[] tablica4 = {0,2,4,2,1,0,1};
/*
        System.out.println(sortowanieStrumieniem(tablica1));
        System.out.println(sortowanieStrumieniem(tablica2));
        System.out.println(sortowanieStrumieniem(tablica3));
        System.out.println(sortowanieStrumieniem(tablica4));
*/
        Wyswietlacz(sortowaniePrzezWstawienie(tablica1));
        Wyswietlacz(sortowaniePrzezWstawienie(tablica2));
        Wyswietlacz(sortowaniePrzezWstawienie(tablica3));
        Wyswietlacz(sortowaniePrzezWstawienie(tablica4));

    }

    public static int[] sortowaniePrzezWstawienie(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int currentElement = array[i];
            int j = i - 1;
            // Przesuwanie elementów większych od currentElement do przodu
            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j--;
            }
            // Wstawianie currentElement na właściwe miejsce
            array[j + 1] = currentElement;
        }
        return array;
    }

    public static List<Integer> sortowanieStrumieniem(int[] tablica){
       List<Integer> result = Arrays.stream(tablica)
               .boxed()
               .sorted()
               .collect(Collectors.toList());
       return result;
    }

    public static void Wyswietlacz(int[] tablica){
        for (int entry: tablica) {
            System.out.print(entry + " ");
        }
        System.out.println();
        System.out.println("---------------------------");
    }
}
