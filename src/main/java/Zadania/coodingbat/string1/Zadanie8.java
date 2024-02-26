package Zadania.coodingbat.string1;

/*Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
        withoutEnd("Hello") → "ell"
        withoutEnd("java") → "av"
        withoutEnd("coding") → "odin"*/

public class Zadanie8 {
    public static void main(String[] args) {

        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));

        System.out.println(withoutEnd2("Hello"));
        System.out.println(withoutEnd2("java"));
        System.out.println(withoutEnd2("coding"));

    }
    public static String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    public static String withoutEnd2(String str) {
        char[] text = str.toCharArray();
        String result = "";
        for (int i = 1; i < str.length() - 1; i++) {
            result = result + text[i];
        }
        return result;
    }
}
