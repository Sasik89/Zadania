package Zadania.Zadania2903;

/* Napisz program który losuje dwie tablice (10 elementów, zakres 0 - 100).
 Wynikiem działania programu mają być wypisane obie tablice, oraz trzecia tablica w które każdy element jest sumą odpowiadających elementów z dwóch pierwszych tablic.
 Przykład:
        1 4 4 64 45
        23 32 5 23 3
        24 36 9 87 48*/

import java.util.Random;

public class Zadanie8 {

    // TODO: 16.01.2024 Działa 
    
    public static void main(String[] args) {

        TablicaSuma();

    }

    public static void TablicaSuma() {
        Random random = new Random();
        int[] tablica1 = new int[10];
        int[] tablica2 = new int[10];
        int[] tablicaSuma = new int[10];
        for (int i = 0; i < 10; i++) {
            tablica1[i] = random.nextInt(100);
            tablica2[i] = random.nextInt(100);
        }

        for(int i = 0; i< tablicaSuma.length;i++){
            tablicaSuma[i] = tablica1[i] + tablica2[i];

        }
        for(int i = 0; i<tablica1.length; i++) {
            System.out.print(tablica1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i<tablica2.length; i++) {
            System.out.print(tablica2[i] + " ");

        }
        System.out.println();
        for(int i = 0; i<tablicaSuma.length; i++){
            System.out.print(tablicaSuma[i] + " ");
        }
    }
}
