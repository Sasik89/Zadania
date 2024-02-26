package Zadania.coodingbat.string1;


/*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
       firstHalf("WooHoo") → "Woo"
        firstHalf("HelloThere") → "Hello"
        firstHalf("abcdef") → "abc"*/

public class Zadanie7 {
    public static void main(String[] args) {

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));

    }
    public static String firstHalf(String str) {
        int liczba = str.length();
        return str.substring(0,liczba/2);
    }
}
