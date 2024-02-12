package Zadania.Zadania2903;

/*Napisz program generujący dwuwymiarową tablice (5x5) losowych liczb.
 Wynikiem działania programu ma być wyświetlona tablica oraz
 najmniejsza liczba z tej tablicy. Zakres losowych liczb 0 - 100.*/

import java.util.Random;

public class Zadanie2 {

    // TODO: 14.01.2024 Działa 
    
    public static void main(String[] args) {

        LosowanieTablica();

    }

    public static void LosowanieTablica() {
        Random random = new Random();
        int najmniejsza = 100;
        int[][] tablica = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablica[i][j] = random.nextInt(100);
                if(tablica[i][j] <100){
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(tablica[i][j] < najmniejsza){            //kod odpowiedzialny za znalezienie najmniejszej liczby
                    najmniejsza = tablica[i][j];
                }
                if(tablica[i][j]<10){
                    System.out.print(tablica[i][j] + "  "); //kod odpowiedzialny za wywietlanie liczb jednocyfrowych
                } else {
                    System.out.print(tablica[i][j] + " ");  //kod odpowiedzialny za wywietlanie liczb dwucyfrowych
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Najmniejsza wartość w tablicy wynosi: " + najmniejsza);
    }
}
