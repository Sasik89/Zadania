package Zadania.coodingbat.warmup1;

/*We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
Mówimy, że liczba to „nastolatek”, jeśli mieści się w przedziale od 13 do 19 włącznie. Biorąc pod uwagę 3 wartości int, zwróć wartość true, jeśli 1 lub więcej z nich to nastolatki.

        hasTeen(13, 20, 10) → true
        hasTeen(20, 19, 10) → true
        hasTeen(20, 10, 13) → true*/

public class Zadanie17 {
    public static void main(String[] args) {

        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
        System.out.println(hasTeen(12, 9, 20));

    }
    public static boolean hasTeen(int a, int b, int c) {
        if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)){
            return true;
        } return false;
    }
}
