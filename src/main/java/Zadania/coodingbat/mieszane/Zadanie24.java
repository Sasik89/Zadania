/*

Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.)

Biorąc pod uwagę ciąg, zwróć sumę cyfr 0-9, które pojawiają się w ciągu, ignorując wszystkie inne znaki. Zwróć 0, jeśli w łańcuchu nie ma cyfr.
(Uwaga: Character.isDigit(char) sprawdza, czy znak jest jednym ze znaków „0”, „1”, .. „9”. Integer.parseInt(string) konwertuje ciąg znaków na liczbę całkowitą.)

        sumDigits("aa1bc2d3") → 6
        sumDigits("aa11b33") → 8
        sumDigits("Chocolate") → 0
*/

package Zadania.coodingbat.mieszane;

public class Zadanie24 {

    // TODO: 12.01.2024 Działa

    public static void main(String[] args) {


        String slowo1 = "aa1bc2d3";
        String slowo2 = "aa11b33";
        String slowo3 = "Chocolate";

        sumDigits(slowo1);
        sumDigits(slowo2);
        sumDigits(slowo3);

    }

    public static void sumDigits(String slowo){
        char[] tablica = slowo.toCharArray();
        int suma = 0;
        for (char entry: tablica) {
            if(Character.isDigit(entry)){
                suma = Character.getNumericValue(entry) + suma;
            }
        }
        System.out.println(suma);
    }
}
