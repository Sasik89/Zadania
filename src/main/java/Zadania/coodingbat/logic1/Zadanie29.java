package Zadania.coodingbat.logic1;

/*Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
        shareDigit(12, 23) → true
        shareDigit(12, 43) → false
        shareDigit(12, 44) → false*/

public class Zadanie29 {
    public static void main(String[] args) {

        System.out.println(shareDigit(12,23));
        System.out.println(shareDigit(12,43));
        System.out.println(shareDigit(12,44));

    }

    public static boolean shareDigit(int a, int b) {
        int digitA1 = a / 10;
        int digitA2 = a % 10;
        int digitB1 = b / 10;
        int digitB2 = b % 10;
        return digitA1 == digitB1 || digitA1 == digitB2 ||
                digitA2 == digitB1 || digitA2 == digitB2;
    }
}
