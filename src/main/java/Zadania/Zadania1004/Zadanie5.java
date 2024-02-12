package Zadania.Zadania1004;

/* Napisz program w którym jest tablica zawierająca liczby od 2 do 101 (włącznie).
        Program ma wypisać liczby pierwsze znajdujące się w tej tablicy.
        Należy wykorzystać sito Eratostenesa.
        Sito Eratostenesa znajdziecie na wikipedii.*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie5 {

    // TODO: 19.01.2024 Działa

    public static void main(String[] args) {

        //  WysweitlaczTablicyJednowymiarowej(GeneratorTablic());
        WysweitlaczTablicyJednowymiarowej(SitoEratostenesa(GeneratorTablic()));

    }

    public static int[] GeneratorTablic() {
        List<Integer> tablica = new ArrayList<>();
        for (int i = 2; i < 102; i++) {
            tablica.add(i);
        }
        return tablica.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void WysweitlaczTablicyJednowymiarowej(int[] tablica) {
        for (int entry : tablica) {
            System.out.print(entry + " ");
        }
    }

    public static int[] SitoEratostenesa(int[] tablica) {
        List<Integer> result = new ArrayList<>();
        for (int entry : tablica) {
            if ((entry % 2 != 0 || entry == 2) && (entry % 3 != 0 || entry == 3) && (entry % 5 != 0 || entry == 5 && (entry % 7 != 0 || entry == 7))) {
                result.add(entry);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}