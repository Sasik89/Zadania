package Zadania.zadania.Java.Kubiak;

/*Napisz program, który za pomocą instrukcji do ... while
        znajduje największą i najmniejszą liczbę ze zbioru n wylosowanych
        liczb całkowitych od 0 do 99 (w zadaniu n = 5) oraz
        oblicza średnią ze wszystkich wylosowanych liczb.*/

import java.util.Random;

public class Zadanie317 {
    public static void main(String[] args) {

    MaxMinAvg(5);

    }

    public static void MaxMinAvg(int iloscLosowanychLiczb){
        Random random = new Random();
        int[] tablica = new int[iloscLosowanychLiczb];
        int suma = 0;
        double avg;
        int licznik = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i=0; i<tablica.length;i++){
            tablica[i] = random.nextInt(0, 100);
        }
        do{
            if(tablica[licznik]<max){
                max = tablica[licznik];
            }
            if(tablica[licznik]>min){
                min = tablica[licznik];
            }
            suma = tablica[licznik] + suma;
            licznik++;
            avg = (double)suma/licznik;
        } while(licznik<tablica.length);
        System.out.println("Minimalna liczba to: " + max
                + " Największa liczba to : " + min
                + " Średnia liczba to: " + avg);
    }

}
