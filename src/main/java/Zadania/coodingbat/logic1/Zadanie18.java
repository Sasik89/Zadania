package Zadania.coodingbat.logic1;

/*Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz",
and if divisible by both 3 and 5, use "FizzBuzz".
Biorąc pod uwagę int n, zwróć liczbę w postaci ciągu znaków, po której następuje „!”. Zatem int 6 daje „6!”.
Z wyjątkiem przypadków, gdy liczba jest podzielna przez 3, zamiast liczby użyj „Fizz”, a jeśli liczba jest podzielna przez 5, użyj „Buzz”,
a jeśli jest podzielna zarówno przez 3, jak i 5, użyj „FizzBuzz”.
        fizzString2(1) → "1!"
        fizzString2(2) → "2!"
        fizzString2(3) → "Fizz!"*/

public class Zadanie18 {
    public static void main(String[] args) {

        System.out.println(fizzString2(1));
        System.out.println(fizzString2(2));
        System.out.println(fizzString2(3));

    }
    public static String fizzString2(int n) {
        if(n%3==0 && n%5==0){
            return "FizzBuzz!";
        } else if (n%3==0) {
            return "Fizz!";
        } else if (n%5==0) {
            return "Buzz!";
        } else {
            return n+"!";
        }
    }

}
