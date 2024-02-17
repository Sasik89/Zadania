package Zadania.coodingbat.warmup1;

/*Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
Biorąc pod uwagę niepusty ciąg znaków i int N, zwróć ciąg znaków zaczynający się od znaku 0, a następnie co N-ty znak ciągu.
Więc jeśli N wynosi 3, użyj znaków 0, 3, 6, ... i tak dalej. N wynosi 1 lub więcej.
        everyNth("Miracle", 2) → "Mrce"
        everyNth("abcdefg", 2) → "aceg"
        everyNth("abcdefg", 3) → "adg"*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie29 {
    public static void main(String[] args) {

        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));


    }
    public static String everyNth(String str, int n) {
        int liczbaZnakow = str.length();
        char[] tablica = str.toCharArray();
        String result = "";
        for(int i = 0; i<liczbaZnakow; i=i+n){
            result = result + tablica[i];
        }
        return result;
    }


}
