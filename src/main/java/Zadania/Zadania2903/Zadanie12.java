package Zadania.Zadania2903;

/* Napisz program który generuje tablicę liczb 0 i 1 (10 elementów).
  Program ma sprawdzić czy tablica jest symetryczna - pierwszy element taki jak ostatni, drugi taki jak przedostatni itd.
 Wynikiem działania programu ma być wypisana wygenerowana tablica oraz true albo false w zależności czy jest symetria czy nie.*/

import java.util.Random;
import java.util.Scanner;

public class Zadanie12 {

    // TODO: 16.01.2024 Działa 
    
    public static void main(String[] args) {

    CzySymetrycznaTablicaFinal();

    }

    public static int[] GeneratorTablic(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ilu elementową tablicę chcesz wygenerować?");
        int a = scanner.nextInt();
        System.out.println("Od 0 do jakiej cyfry chcesz wygenerować tablicę?");
        int b = scanner.nextInt();
        int[] tablica = new int[a];
        for(int i = 0; i< tablica.length;i++){
            tablica[i] = random.nextInt(b+1);
        }
        return tablica;
    }

    public static void wyswietlaczBoolean(boolean zmienna){
        if(zmienna){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void WysweitlaczTablicyJednowymiarowej(int[] tablica){
        for (int entry: tablica) {
            System.out.print(entry + " ");
        }
    }

    public static boolean CzySymetryczna(int[] tablica){
        boolean result = false;
            int j = tablica.length-1;
            for(int i = 0; i<(tablica.length)/2;i++){
                if(tablica[i] == tablica[j]){
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static void CzySymetrycznaTablicaFinal(){
        int [] tablica = GeneratorTablic();
        WysweitlaczTablicyJednowymiarowej(tablica);
        wyswietlaczBoolean(CzySymetryczna(tablica));
    }

}
