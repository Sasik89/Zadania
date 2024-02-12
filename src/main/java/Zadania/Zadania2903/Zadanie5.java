package Zadania.Zadania2903;

/*Wypisz na ekranie liczby od 0 do 99. Jeśli liczba jest podzielna przez 3 obok liczny dopisz "Fizz",
 jeśli liczba jest podzielna przez 5 obok liczby dopisz "Buzz",
 jeśli liczba jest podzielna przez 3 i 5 obok liczby dopisz "Fizz Buzz". Przykład:
 1 // 2 //   3 Fizz //4 // 5 Buzz //6 Fizz //7 // 8 // 9 Fizz //10 // 11 //12 Fizz //13 //14 // 15 Fizz Buzz*/

public class Zadanie5 {

    // TODO: 21.01.2024 Działa

    public static void main(String[] args) {

        FizzBuzz();

    }

    public static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " Fizz Bazz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Bazz");
            } else if (i % 5 != 0 && i % 3 == 0) {
                System.out.println(i + " Fizz");
            }
        }
    }
}