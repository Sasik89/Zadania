package Zadania.Zadania2903;

/*
Napisz program generujący jednowymiarową tablicę (10 elementów) liczb w której każda liczba jest losowa ale nie
 jest mniejsza niż poprzednia liczba. Przykłady: 23, 34, 53, 60, 80
nieprawidłowy wynik: 34, 56, 34, 78, 99 - trzecia liczba jest mniejsza niż poprzednia (druga).
Wynikiem działania programu ma być wyświetlona wygenerowana tablica. Zakres losowych liczb 0 - 20
*/


import java.util.Random;

public class Zadanie3 {

    // TODO: 15.01.2024 Działa

    public static void main(String[] args) {

        LosowanieTablicy();

    }

    public static void LosowanieTablicy(){
        Random random = new Random();
        int[] tablica = new int[10];
        for(int i = 0; i<10;i++){
                if(i == 0){
                    tablica[i] = random.nextInt(100);
                } else {
                    while(tablica[i] < tablica[i-1]){
                        tablica[i] = random.nextInt(100);
                    }
                    }
                }
        for(int i = 0; i<10;i++){
            System.out.print(tablica[i] + " ");
        }
        }
    }

