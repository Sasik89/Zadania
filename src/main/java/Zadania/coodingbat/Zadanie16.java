package Zadania.coodingbat;

/*Given a string and a non-empty word string, return a version of the original
String where all chars have been replaced by pluses ("+"),
 except for appearances of the word string which are preserved unchanged.

Biorąc pod uwagę ciąg znaków i niepusty ciąg słów, zwróć wersję oryginału
Ciąg znaków, w którym wszystkie znaki zostały zastąpione plusami („+”),
 z wyjątkiem wystąpień ciągu słów, które pozostają niezmienione.

        plusOut("12xy34", "xy") → "++xy++"
        plusOut("12xy34", "1") → "1+++++"
        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"*/

import java.util.Arrays;

public class Zadanie16 {
    public static void main(String[] args) {

        String a1 = "12xy34";
        String a2 = "xy";
        String b1 = "12xy34";
        String b2 = "1";
        String c1 = "12xy34xyabcxy";
        String c2 = "xy";

/*        System.out.println(plusOut(a1, a2));
        System.out.println(plusOut(b1, b2));
        System.out.println(plusOut(c1, c2));*/

        System.out.println(plusOut(a1, a2));
        System.out.println(plusOut(b1, b2));
        System.out.println(plusOut(c1, c2));

    }
    public static String plusOut2(String str, String word) {
        char[] slowoKlucz = str.toCharArray();
        String noweSlowo = str.replaceAll(word,"*");
        char[] noweSlowo2 = noweSlowo.toCharArray();
        for(char slowo : noweSlowo2){
            if(slowo != '*'){
                slowo = '+';
            }
        }
        String noweSlowo3 = Arrays.toString(slowoKlucz);
        String noweSlowo4 = noweSlowo3.replaceAll("'*'", word);
        return noweSlowo4;
    }

    public static String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (str.startsWith(word, i)) {
                result.append(word);
                i += word.length();
            } else {
                result.append('+');
                i++;
            }
        }
        return result.toString();
    }

/*    Ta funkcja działa w następujący sposób:

            1. Tworzy obiekt `StringBuilder` o nazwie `result`, który będzie przechowywał wynikową zmienną typu `String`.
            2. Przechodzi przez każdy znak w ciągu `str` za pomocą pętli `while`.
            3. Sprawdza, czy ciąg `str` zaczyna się od ciągu `word` od aktualnej pozycji `i`.
            4. Jeśli tak, to dołącza `word` do `result` i przesuwa `i` o długość `word`.
            5. Jeśli nie, to dołącza "+" do `result` i przesuwa się do następnego znaku w `str`.
            6. Powtarza te kroki aż do przeanalizowania całego ciągu `str`.
            7. Zwraca wynikową zmienną typu `String`.
    */
}

