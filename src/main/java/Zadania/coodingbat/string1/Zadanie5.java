package Zadania.coodingbat.string1;

/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
        extraEnd("Hello") → "lololo"
        extraEnd("ab") → "ababab"
        extraEnd("Hi") → "HiHiHi"*/

public class Zadanie5 {
    public static void main(String[] args) {

        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));

    }
    public static String extraEnd(String str) {
        int dlugosc = str.length();
       return str.substring(dlugosc-2, dlugosc).repeat(3);
    }

}
