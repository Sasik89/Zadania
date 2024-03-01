package Zadania.coodingbat.string1;

/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
So "Hello" and "Hi" yield "loHi". The strings may be any length.
Biorąc pod uwagę dwa ciągi, dołącz je do siebie (tzw. „łączenie”) i zwróć wynik.
Jeśli jednak ciągi mają różną długość, pomiń znaki z dłuższego ciągu, tak aby miał tę samą długość co krótszy ciąg.
Zatem „Hello” i „Hi” dają „loHi”. Stringi mogą mieć dowolną długość.
        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"*/

public class Zadanie27 {
    public static void main(String[] args) {

        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));


    }
    public static String minCat(String a, String b) {
        if(a.length()>b.length()){
            return a.substring(a.length()-b.length(), a.length()) + b.substring(0, b.length());
        } else if (b.length()>a.length()){
            return a.substring(0, a.length()) + b.substring(b.length()-a.length(), b.length());
        }
        return "";
    }

}
