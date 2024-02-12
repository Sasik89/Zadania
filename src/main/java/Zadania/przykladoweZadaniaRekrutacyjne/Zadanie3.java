package Zadania.przykladoweZadaniaRekrutacyjne;

/*Napisz metodę usuwającą z listy duplikaty. Przykładowa lista (1, 2, 3, 4, 5, 6, 3, 6, 8, 9)
Napisz to przy pomocy Listy, tablicy oraz strumienia*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Zadanie3 {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(4, 1, 6, 7, 2, 4, 7, 5, 2, 5, 7, 2);
        int[] tablica = {4, 1, 6, 7, 2, 4, 7, 5, 2, 5, 7, 2};

        usunDuplikatyZListy(lista);
        usunDuplikatyzListyStrumien(lista);
        wyswietlanie(removeDuplicates(tablica));
    }

    public static void usunDuplikatyZListy(List<Integer> lista) {
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (!lista2.contains(lista.get(i))) {  //jeżeli lista2 (nowo powstała nie zawiera danej cyfry) to dodaj jej do listy
                lista2.add(lista.get(i));       //dodawanie do listy
            }
        }
        System.out.println(lista2);
    }

    private static int[] removeDuplicates(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                // Sprawdzenie, czy elementy są takie same
                if (arr[i] == arr[j]) {
                    // Zamiana duplikatu z ostatnim elementem tablicy
                    arr[j] = arr[length - 1];
                    length--; // Zmniejszenie rozmiaru tablicy
                    j--; // Dekrementacja indeksu wewnętrznej pętli
                }
            }
        }
        // Przycinanie tablicy do rozmiaru bez duplikatów
        return Arrays.copyOf(arr, length);
    }

    public static void usunDuplikatyzListyStrumien(List<Integer> lista) {
        List<Integer> lista2 = lista.stream().distinct().toList();
        //zaminia liste na strumień, następnie usuwa duplikaty i zamienia z powrotem na liste
        for (Integer entry : lista2) {
            System.out.print(entry + " ");
        }
    }

    public static void wyswietlanie(int[] lista){
        System.out.println();
        for (int entry: lista) {
            System.out.print(entry + " ");
        }
    }

}



