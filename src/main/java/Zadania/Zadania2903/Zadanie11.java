package Zadania.Zadania2903;

/* Napisz program który symuluje rzuty dwiema kastkami do gry (takie zwykłe białe kości jak w monopoly).
 Program ma wykonać 10 000 rzutów i wypisać liczbę która wypadała najczęściej
 (ta liczba jest oczywiście sumą oczek na dwóch kościach które symulujemy.*/

import java.util.*;
import java.util.stream.Collectors;

public class Zadanie11 {
    public static void main(String[] args) {


        RzutKoscia();
        //RzutKoscia2();

    }

    public static void RzutKoscia() {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            lista.add(random.nextInt(7));
        }

        Optional<Map.Entry<Integer, Long>> mostCommonNumber = lista.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        System.out.println("Najczęściej występujacą liczbą jest: " + mostCommonNumber.get());
    }

    public static void RzutKoscia2() {
        int jeden = 0;
        int dwa = 0;
        int trzy = 0;
        int cztery = 0;
        int piec = 0;
        int szesc = 0;
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int wynik = random.nextInt(7);
            if (wynik == 1) {
                jeden++;
            }
            if (wynik == 2) {
                dwa++;
            }
            if (wynik == 3) {
                trzy++;
            }
            if (wynik == 4) {
                cztery++;
            }
            if (wynik == 5) {
                piec++;
            }
            if (wynik == 6) {
                szesc++;
            }
        }

        List<Integer> suma = List.of(piec, jeden, dwa, trzy, cztery,szesc);
        Optional<Integer> max = suma.stream().max(Integer::compareTo);

        System.out.println("Maksymalnie wylosowano liczbe: " + max); //nie działa do konca poprawnie
    }
}

