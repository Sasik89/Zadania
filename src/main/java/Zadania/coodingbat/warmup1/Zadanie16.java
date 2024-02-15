package Zadania.coodingbat.warmup1;

/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
Biorąc pod uwagę 2 wartości int, zwróć wartość true, jeśli którakolwiek z nich mieści się w zakresie 10..20 włącznie.

        in1020(12, 99) → true
        in1020(21, 12) → true
        in1020(8, 99) → false*/

public class Zadanie16 {
    public static void main(String[] args) {


    }
    public static boolean in1020(int a, int b) {
        if (a <= 20 && a >= 10) {
            return true;
        }
        if (b <= 20 && b >= 10) {
            return true;
        }
        return false;
    }
}
