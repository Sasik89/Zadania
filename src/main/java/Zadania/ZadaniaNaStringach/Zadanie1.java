package Zadania.ZadaniaNaStringach;

/*Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.
        repeatEnd("Hello", 3) → "llollollo"
        repeatEnd("Hello", 2) → "lolo"
        repeatEnd("Hello", 1) → "o"*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie1 {

    // TODO: 24.01.2024 Działa 
    
    public static void main(String[] args) {

        repeatEnd("Hello", 6);

    }
    public static void repeatEnd(String string, int liczbaPowtorzen) {
        try {
            List<Character> result = new ArrayList<>();
            char[] tablicaCharow = string.toCharArray();
            int granicaSlowa = string.length() - liczbaPowtorzen;
            int rzeczywistaLiczbaPowtorzen = 0;
            boolean flag = true;
            while (true) {
                for (int i = granicaSlowa; i < string.length(); i++) {
                    result.add(tablicaCharow[i]);
                }
                rzeczywistaLiczbaPowtorzen++;
                if (rzeczywistaLiczbaPowtorzen == liczbaPowtorzen) {
                    flag = false;
                    break;
                }
            }
            String wynik = result.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining());
            System.out.println(wynik);
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Podana liczba jest poza zakresem");
        }
    }
}

