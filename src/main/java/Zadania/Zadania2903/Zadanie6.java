package Zadania.Zadania2903;

/* Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
 Program ma wygenerować druga tablicę która jest pierwszą tablicą w odwrotnej kolejności.
 Wynikiem działania programu ma być wyświetlona pierwsza i druga tablica. Przykłady:
        3, 23, 2, 23, 53
        53, 23, 2, 23, 3
        Zakres losowych liczb 0 - 100.*/

import java.util.Random;

public class Zadanie6 {

    // TODO: 15.01.2024 Działa

    public static void main(String[] args) {

    TablicaOdwrotnie();

    }

    public static void TablicaOdwrotnie() {
        Random random = new Random();
        int[] tablica1 = new int[10];
        int[] tablica2 = new int[10];
        for (int i = 0; i < 10; i++) {
            tablica1[i] = random.nextInt(100);
            for (int j = (9-i); true; j--) {
                tablica2[j] = tablica1[i];
                break;
            }
        }
        System.out.println();
        for (int i = 0; i<10; i++){
            System.out.print(tablica1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i<10; i++){
            System.out.print(tablica2[i] + " ");
        }
    }
}
