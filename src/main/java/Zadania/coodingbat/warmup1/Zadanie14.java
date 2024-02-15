package Zadania.coodingbat.warmup1;

/*Given a string, return true if the string starts with "hi" and false otherwise.
Biorąc pod uwagę ciąg, zwróć wartość true, jeśli ciąg zaczyna się od „cześć”, i fałsz w przeciwnym razie.

        startHi("hi there") → true
        startHi("hi") → true
        startHi("hello hi") → false*/

public class Zadanie14 {
    public static void main(String[] args) {

        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));

    }
    public static boolean startHi(String str) {
    if(str.startsWith("hi")) {
        return true;
    }
    return false;
    }
}
