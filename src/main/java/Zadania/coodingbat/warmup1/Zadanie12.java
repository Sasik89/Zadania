package Zadania.coodingbat.warmup1;

/*Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
Zwraca wartość true, jeśli podana liczba nieujemna jest wielokrotnością 3 lub 5.

        or35(3) → true
        or35(10) → true
        or35(8) → false*/

public class Zadanie12 {
    public static void main(String[] args) {

        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));


    }
    public static boolean or35(int n) {
        if(n%5==0 || n%3==0){
            return true;
        }
        return false;
    }
}
