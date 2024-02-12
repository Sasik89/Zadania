package Zadania.itCamp9;

//Wygeneruj tablicę losową na 1000 elementów i znajdź liczbę najczęściej występującą

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Zadanie6 {
    public static void main(String[] args) {

       int[] nowTablica = generowanieTablic();

        wyswietlaczMapy(zamieniaczTablicyNaMape(nowTablica));
        NajczestszaLiczbaZTablicy(nowTablica);

    }
    public static int[] generowanieTablic() {
        int[] tablica = new int[20];
        Random random = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(6);
        }
        return tablica;
    }
    public static void generatorWyswietlaniaTablicy(int[] tablica) {
        int dlugoscTablicy = tablica.length;
        for (int i = 0; i < dlugoscTablicy; i++) {
            if (tablica[i] > 9) {
                System.out.print(tablica[i] + " ");
            }
            if (tablica[i] < 9) {
                System.out.print(tablica[i] + "  ");
            }
            if (i % 20 == 0 && i != 0) {
                System.out.println();
            }
        }
    }
    public static Map<Integer, Integer> zamieniaczTablicyNaMape(int[] tablica) {
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int element : tablica) {
            if (!mapa.containsKey(element)) {
                mapa.put(element, 0);
            }
        }
        for (Integer wartosc : tablica) {
            int kluczDoInkrementacji = wartosc;
            int aktualnaWartosc = mapa.getOrDefault(kluczDoInkrementacji, 0);
            mapa.put(kluczDoInkrementacji, aktualnaWartosc + 1);
        }
        return mapa;
    }
    public static void wyswietlaczMapy(Map<Integer, Integer> mapa) {
        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue());
        }
    }
    public static void NajczestszaLiczbaZTablicy(int[] tablica){
        Map<Integer, Integer> mapa = zamieniaczTablicyNaMape(tablica);
        int klucz = 0;
        int max = Integer.MIN_VALUE;
        for(int element: mapa.values()){
            if(element>max){
                max = element;
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() == max) {
                klucz = entry.getKey();
                break;
            }
        }
        System.out.println("Najczęsciej występującą liczba jest " + klucz + " wystapiła ona " + max + " razy!");

    }
}





