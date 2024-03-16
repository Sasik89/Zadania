package Zadania.coodingbat.logic2;


/*Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far",
differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
Biorąc pod uwagę trzy inty, a b c, zwróć wartość true, jeśli jedno z b lub c jest „bliskie” (różni się od a co najwyżej o 1),
podczas gdy drugie jest „dalekie”, różniące się od obu pozostałych wartości o 2 lub więcej. Uwaga: Math.abs(num) oblicza wartość bezwzględną liczby.
        closeFar(1, 2, 10) → true
        closeFar(1, 2, 3) → false
        closeFar(4, 1, 3) → true*/

public class Zadanie6 {
    public static void main(String[] args) {

        System.out.println(closeFar(1,2,10));
        System.out.println(closeFar(1,2,3));
        System.out.println(closeFar(4,1,3));

    }
    public static boolean closeFar(int a, int b, int c) {
        if((Math.abs(a-b)<=1 && Math.abs(a-c)>=2&& Math.abs(b-c)>=2) || (Math.abs(a-c)<=1 && Math.abs(a-b)>=2 && Math.abs(c-b)>=2)){
            return true;
        }
        return false;
    }

}
