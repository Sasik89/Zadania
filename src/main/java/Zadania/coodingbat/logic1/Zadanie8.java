package Zadania.coodingbat.logic1;

/*Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true,
in which case return true if the number is less or equal to 1, or greater or equal to 10.
Biorąc pod uwagę liczbę n, zwróć wartość true, jeśli n należy do zakresu 1..10 włącznie. Chyba że outsideMode ma wartość true,
w takim przypadku zwróć wartość true, jeśli liczba jest mniejsza lub równa 1, większa lub równa 10.
        in1To10(5, false) → true
        in1To10(11, false) → false
        in1To10(11, true) → true*/

public class Zadanie8 {
    public static void main(String[] args) {

        System.out.println(in1To10(5,false));
        System.out.println(in1To10(11,false));
        System.out.println(in1To10(11,true));
        System.out.println(in1To10(9,true));
        System.out.println(in1To10(0,false));

    }
    public static boolean in1To10(int n, boolean outsideMode) {
        if(n>=1 && n<=10 && !outsideMode){
            return true;
        }if(n>1 && n<10 && outsideMode) {
            return false;
        }
        if((n<=1 || n>=10) && outsideMode){
            return true;
        } else {
            return false;
        }
    }
}
