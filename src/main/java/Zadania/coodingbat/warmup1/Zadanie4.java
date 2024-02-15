package Zadania.coodingbat.warmup1;

/*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        makes10(9, 10) → true
        makes10(9, 9) → false
        makes10(1, 9) → true*/

public class Zadanie4 {
    public static void main(String[] args) {


    }
    public boolean makes10(int a, int b) {
        if(a ==10 || b == 10){
            return true;
        }
        return a + b == 10;
    }

}
