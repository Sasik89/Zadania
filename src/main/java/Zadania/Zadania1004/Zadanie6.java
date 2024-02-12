package Zadania.Zadania1004;

/*
Napisz program generujący tablicę liczb 10 elementową (liczby -7 do 7).
Program sprawdza czy tablica zawiera duplikaty, jeśli zawiera to generuje nową.
Program ma wyświetlić wygenerowaną tablicę bez duplikatów oraz ilość powtórnych generacji tablicy.
*/

import java.util.Random;

public class Zadanie6 {

    // TODO: 19.01.2024 Działa 

    public static void main(String[] args) {

        int[] tablica = GeneratorTablic(10, -7, 7);

        //int[] tablicaTestowa = {1,2,3,4,5,6,7,8};

        // WysweitlaczTablicyJednowymiarowej(tablica);

        // System.out.println(czyZawieraDuplikaty(tablicaTestowa));

        losujDoPukiBrakDuplikatowIZlicz(tablica);

    }

    public static int[] GeneratorTablic(int wielkoscTablicy, int zakresDolnyTablic, int zakresGornyTablicy) {
        Random random = new Random();
        int[] tablica = new int[wielkoscTablicy];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(zakresDolnyTablic, zakresGornyTablicy + 1);
        }
        return tablica;
    }

    public static void WysweitlaczTablicyJednowymiarowej(int[] tablica) {
        for (int entry : tablica) {
            System.out.print(entry + " ");
        }
    }

    public static boolean czyZawieraDuplikaty(int[] tablica) {
        int dlugosc = tablica.length;
        boolean result = true;
        for (int i = 0; i < dlugosc; i++) {
            for (int j = i + 1; j < dlugosc; j++) {
                if (tablica[i] == tablica[j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }  //zwraca true jesli tablica nie zawiera duplikatów

    public static void losujDoPukiBrakDuplikatowIZlicz(int[] tablica) {
        int[] nowaTablica;
        nowaTablica = tablica;
        int counter = 0;
        boolean czySaDuplikaty = true;
        while (czySaDuplikaty) {
            if (!czyZawieraDuplikaty(nowaTablica)) {
                nowaTablica = GeneratorTablic(10, -7, 7);
                counter++;
            } else {
                czySaDuplikaty = false;
            }
        }
        System.out.println("Tablica przekręciła się: " + counter + " Jej wynik to: ");
        for (int entry : nowaTablica) {
            System.out.print(entry + " ");
        }
    }

}
