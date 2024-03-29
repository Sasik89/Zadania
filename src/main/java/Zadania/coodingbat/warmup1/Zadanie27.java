package Zadania.coodingbat.warmup1;

/*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
Biorąc pod uwagę dwie nieujemne wartości typu int, zwróć wartość true, jeśli mają tę samą ostatnią cyfrę, np. 27 i 57.
Pamiętaj, że operator % „mod” oblicza resztę, więc 17% 10 równa się 7.

        lastDigit(7, 17) → true
        lastDigit(6, 17) → false
        lastDigit(3, 113) → true*/

public class Zadanie27 {
    public static void main(String[] args) {

        System.out.println(lastDigit(7,17));
        System.out.println(lastDigit(6,17));
        System.out.println(lastDigit(3,113));

    }
    public static boolean lastDigit(int a, int b) {
        if(a%10==b%10){
            return true;
        } return false;
    }
}
