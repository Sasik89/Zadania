package Zadania.coodingbat.Array3;


/*(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array,
but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move.
The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.
(Jest to nieco trudniejsza wersja problemu fix34.) Zwraca tablicę zawierającą dokładnie te same liczby, co podana tablica,
ale przestawione tak, aby po każdej 4 bezpośrednio następowała 5. Nie przesuwaj 4, ale każda inna liczba może zostać przesunięta.
Tablica zawiera tę samą liczbę cyfr 4 i 5, a po każdej 4 znajduje się liczba inna niż 4. W tej wersji cyfry 5 mogą pojawić się w dowolnym miejscu oryginalnej tablicy.
        fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
        fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
        fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {

        // TODO: 22.04.2024 Działa 

        int[] tablica1 = {5, 4, 9, 4, 9, 5};
        int[] tablica2 = {1, 4, 1, 5};
        int[] tablica3 = {1, 4, 1, 5, 5, 4, 1};

        wyswietlacz(fix45(tablica1));
        wyswietlacz(fix45(tablica2));
        wyswietlacz(fix45(tablica3));

    }
    public static int[] fix45(int[] nums) {
        int five = 0;
        List<Integer> bufor = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int element : nums) {
            if (element != 4 & element !=5) {
                bufor.add(element);
            }
            if (element == 5) {
                five++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) {
                result.add(bufor.get(0));
                remove(bufor);
            }
            else if (nums[i] == 4 && five > 0) {
                result.add(4);
                result.add(5);
                five--;
                i++;
            }
            else if (nums[i] == 4 && five == 0) {
                result.add(4);
                result.add(bufor.get(0));
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void wyswietlacz(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void remove(List<Integer> lista) {
        List<Integer> clone = new ArrayList<>(lista);
        lista.clear();
        for (int i = 1; i < clone.size(); i++) {
            lista.add(clone.get(i));
        }
    }

}
