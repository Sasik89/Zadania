package Zadania.coodingbat.string1;

/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        conCat("abc", "cat") → "abcat"
        conCat("dog", "cat") → "dogcat"
        conCat("abc", "") → "abc"*/

import java.util.stream.Collectors;

public class Zadanie23 {
    public static void main(String[] args) {

        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));

    }

    // TODO: 01.03.2024 Nie działa 

    public static String conCat(String a, String b) {
        String str = new StringBuilder().append(a).append(b).toString();
        return str;
    }
    }
