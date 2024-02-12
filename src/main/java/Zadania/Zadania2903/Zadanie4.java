package Zadania.Zadania2903;

/*Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
Wynikiem działania programu ma być wygenerowana tablica oraz ilość powtórzeń liczby 5.
 Zakres losowych liczb 0 - 10.*/

import java.util.Random;

public class Zadanie4 {

    // TODO: 16.01.2024 Działa 
    
    public static void main(String[] args) {

        generowanieTablicy();

    }

    public static void generowanieTablicy(){
        Random random = new Random();
        int counter = 0;
        int[] tablica = new int[10];
        for(int i = 0; i<10;i++){
            tablica[i] = random.nextInt(10);
            if(tablica[i] == 5){
                counter++;
            }
        }
        for(int i = 0; i<10;i++){
            System.out.print(tablica[i] + " ");

        }
        System.out.println();
        System.out.println("Liczba powtorzen liczby 5 wynosi: " + counter);
    }

}
