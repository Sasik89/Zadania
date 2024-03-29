package Zadania.coodingbat.warmup1;

/*Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
The original string will be length 1 or more.
Biorąc pod uwagę ciąg, weź ostatni znak i zwróć nowy ciąg z ostatnim znakiem dodanym z przodu i z tyłu, więc „cat” daje „tcatt”.
Oryginalny ciąg będzie miał długość 1 lub więcej.

        backAround("cat") → "tcatt"
        backAround("Hello") → "oHelloo"
        backAround("a") → "aaa"*/

public class Zadanie11 {
    public static void main(String[] args) {

        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));

    }

    public static String backAround(String str) {
        char[] tablica = str.toCharArray();
        int dlugoscStringa = str.length();
        char lastLetter = tablica[dlugoscStringa-1];
        String result = lastLetter + str + lastLetter;
        return result;
    }

}
