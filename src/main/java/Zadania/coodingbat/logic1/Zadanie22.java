package Zadania.coodingbat.logic1;


/*Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
Biorąc pod uwagę trzy inty, a b c, zwróć wartość true, jeśli co najmniej dwie z nich mają tę samą cyfrę skrajną na prawo. Inty są nieujemne.
        lastDigit(23, 19, 13) → true
        lastDigit(23, 19, 12) → false
        lastDigit(23, 19, 3) → true*/

public class Zadanie22 {
    public static void main(String[] args) {

        System.out.println(lastDigit(23,19,13));
        System.out.println(lastDigit(23,19,12));
        System.out.println(lastDigit(23,19,3));

    }
    public static boolean lastDigit(int a, int b, int c) {
        if(a%10==b%10 || b%10==c%10 || a%10==c%10) {
            return true;
        } else {
            return false;
        }
    }

}
