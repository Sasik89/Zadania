package Zadania.coodingbat.string1;

/*Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
        atFirst("hello") → "he"
        atFirst("hi") → "hi"
        atFirst("h") → "h@"*/

public class Zadanie21 {
    public static void main(String[] args) {

        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));


    }
    public static String atFirst(String str) {
        String result;
        switch (str.length()){
           case 0 -> result="@@";
           case 1 -> result=str.substring(0,1)+"@";
           default -> result=str.substring(0,2);
        }
        return result;
    }
}
