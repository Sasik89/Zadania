package Zadania.coodingbat.Array3;


/*Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's,
every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
Zwraca tablicę zawierającą dokładnie te same liczby, co podana tablica, ale uporządkowaną w taki sposób, że po każdej liczbie 3 bezpośrednio następuje cyfra 4.
Nie przesuwaj trójek, ale każda inna liczba może się poruszyć. Tablica zawiera tę samą liczbę trójek i czwórek,
po każdej trójce znajduje się liczba inna niż trójka, a cyfra 3 pojawia się w tablicy przed dowolną cyfrą 4.
        fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
        fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
        fix34([3, 2, 2, 4]) → [3, 4, 2, 2]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {

        // TODO: 22.04.2024 Działa

        int[] tablica1 = {1, 3, 1, 4};
        int[] tablica2 = {1, 3, 1, 4, 4, 3, 1};
        int[] tablica3 = {3, 2, 2, 4};

        wyswietlacz(fix34(tablica1));
        wyswietlacz(fix34(tablica2));
        wyswietlacz(fix34(tablica3));

    }

    public static int[] fix34(int[] nums) {
        int four = 0;
        List<Integer> bufor = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int element : nums) {
            if (element != 4 & element!=3) {
                bufor.add(element);
            }
            if (element == 4) {
                four++;
            }
        }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 3) {
                    result.add(bufor.get(0));
                    remove(bufor);
                }
                else if (nums[i] == 3 && four > 0) {
                    result.add(3);
                    result.add(4);
                    four--;
                    i++;
                }
                else if (nums[i] == 3 && four == 0) {
                    result.add(3);
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
