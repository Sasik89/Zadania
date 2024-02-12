package Zadania.Zadania1004;

/*Napisz program, który generuje 30 elementową tablicę (liczby 0 - 100).
 Program powinien wypisywać na ekranie wygenerowaną tablicę oraz drugą największą liczbę w tablicy.
 Przykład:
        [1,2,3,4,5,6]
        5
        [2,3,6,9,34,35}
        34*/

import Zadania.Zadania2903.Zadanie12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Zadanie4 {

    // TODO: 17.01.2024 Działa

    public static void main(String[] args) {

        DrugaNajwiekszaLiczbaMetodaGrupujaca();

    }

    public static List<Integer> SortingDescaningList(List<Integer> lista) {
        return lista.stream().sorted(Comparator.reverseOrder()).toList();
    }

    public static void DrugaNajwiekszaLiczba(List<Integer> lista) {
        System.out.println("Drugą największą liczbą w liście jest: " + lista.get(1));
    }

    public static void WyswietlaczListy(List<Integer> lista) {
        for (int entry : lista) {
            System.out.print(entry + " ");
        }
    }

    public static List<Integer> ArrayToList(int[] tablica) {
        List<Integer> lista = new ArrayList<>(tablica.length);
        for (int element : tablica) {
            lista.add(element);
        }
        return lista;
    }

    public static void DrugaNajwiekszaLiczbaMetodaGrupujaca() {
        List<Integer> lista = ArrayToList(Zadanie12.GeneratorTablic());
        WyswietlaczListy(lista);
        System.out.println();
        List<Integer> posortowanaLista = SortingDescaningList(lista);
        WyswietlaczListy(posortowanaLista);
        System.out.println();
        DrugaNajwiekszaLiczba(posortowanaLista);
    }

}
