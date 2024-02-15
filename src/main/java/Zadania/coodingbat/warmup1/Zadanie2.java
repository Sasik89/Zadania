package Zadania.coodingbat.warmup1;

/*Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
        diff21(19) → 2
        diff21(10) → 11
        diff21(21) → 0*/

public class Zadanie2 {
    public static void main(String[] args) {

    diff21(19);
    diff21(10);
    diff21(21);


    }

    public static int diff21(int n) {
        if (n <= 21) {
            int num = Math.abs(21 - n);
            return num;
        } else {
            int num = 2*(Math.abs(21 - n));
            return num;
        }
    }
}
