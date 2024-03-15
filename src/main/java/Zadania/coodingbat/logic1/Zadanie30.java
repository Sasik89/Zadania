package Zadania.coodingbat.logic1;

/*
Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
If the sum has more digits than a, just return a without b.
Biorąc pod uwagę 2 nieujemne liczby całkowite, a i b, zwróć ich sumę, o ile suma ma tę samą liczbę cyfr co a.
Jeśli suma ma więcej cyfr niż a, po prostu zwróć a bez b.
(Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
        sumLimit(2, 3) → 5
        sumLimit(8, 3) → 8
        sumLimit(8, 1) → 9
*/

public class Zadanie30 {
    public static void main(String[] args) {

        System.out.println(sumLimit(2,3));
        System.out.println(sumLimit(8,3));
        System.out.println(sumLimit(8,1));

    }
    public static int sumLimit(int a, int b) {
        if (String.valueOf(a + b).length() == String.valueOf(a).length()) {
            return a + b;
        } else {
            return a;
        }
    }

}
