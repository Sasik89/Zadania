package Zadania.coodingbat.warmup1;

/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.
Mówimy, że liczba to „nastolatek”, jeśli mieści się w przedziale od 13 do 19 włącznie.
Biorąc pod uwagę 2 wartości int, zwróć wartość true, jeśli jedna lub druga osoba jest nastolatkiem, ale nie obie.

        loneTeen(13, 99) → true
        loneTeen(21, 19) → true
        loneTeen(13, 13) → false*/

public class Zadanie18 {
    public static void main(String[] args) {

        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));

    }
    public static boolean loneTeen(int a, int b) {
        if((a>=13 && a<=19) && (b>=13 && b<=19)){
            return false;
        } else if ((a>=13 && a<=19) || (b>=13 && b<=19)) {
            return true;
        }
        return false;
    }
}
