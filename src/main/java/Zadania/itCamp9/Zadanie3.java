package Zadania.itCamp9;

//Wygeneruj tablice 100 elementową liczb losowych a nastepnie znajdz najwieksza liczbe

import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tablica = new int[100];
        int najwiekszaLiczba = 0;

        for(int i = 0; i<100; i++){
            tablica[i]= random.nextInt(0, 101);
            if(tablica[i] > najwiekszaLiczba){
                najwiekszaLiczba = tablica[i];
            }
        }
        System.out.println("Najwieksza z wylosowanych liczb to: " + najwiekszaLiczba);
    }

}
