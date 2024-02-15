package Zadania.coodingbat.warmup1;

/*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
Parametr dzień tygodnia ma wartość true, jeśli jest to dzień powszedni, a parametr urlop ma wartość true, jeśli jesteśmy na wakacjach.
Śpimy do późna, jeśli nie jest to dzień powszedni lub jesteśmy na wakacjach. Zwróć wartość true, jeśli śpimy.

        sleepIn(false, false) → true
        sleepIn(true, false) → false
        sleepIn(false, true) → true*/

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday && !vacation){
            return false;
        }
        if(!weekday && !vacation){
            return true;
        }
        if(!weekday && vacation){
            return true;
        } else{
            return true;
        }
    }
}
