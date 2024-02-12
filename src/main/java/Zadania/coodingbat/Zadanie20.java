/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a,
        the second char of b, and so on. Any leftover chars go at the end of the result.

Biorąc pod uwagę dwa ciągi, aib, utwórz większy ciąg składający się z pierwszego znaku a, pierwszego znaku b, drugiego znaku a,
        drugi znak b i tak dalej. Wszelkie pozostałe znaki trafiają na koniec wyniku.

        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"
*/

package Zadania.coodingbat;

import java.util.ArrayList;

public class Zadanie20 {

    // TODO: 12.01.2024 Działa
    
    public static void main(String[] args) {

        String jeden = "abc";
        String dwa = "xyz";
        String trzy = "Hi";
        String cztery = "There";
        String piec = "xxxx";
        String szesc = "There";

        mixString(jeden,dwa);
        mixString(trzy,cztery);
        mixString(piec,szesc);

    }

    public static void mixString(String pierwszy, String drugi) {
        char[] slowo1 = pierwszy.toCharArray();
        char[] slowo2 = drugi.toCharArray();
        int max = Math.max(slowo1.length, slowo2.length);
        ArrayList<Character> noweSlowo = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            if (i < slowo1.length) {
                    noweSlowo.add(slowo1[i]);
                }
            if (i < slowo2.length) {
                    noweSlowo.add(slowo2[i]);
                }
            }
        String text = String.valueOf(noweSlowo);
        System.out.println(text);
    }
}
