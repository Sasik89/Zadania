package Zadania.coodingbat.warmup1;


/*Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
Biorąc pod uwagę ciąg znaków, jeśli ciąg „del” pojawia się zaczynając od indeksu 1, zwróć ciąg, w którym usunięto ten ciąg „del”. W przeciwnym razie zwróć ciąg znaków bez zmian.

        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"*/

public class Zadanie19 {
    public static void main(String[] args) {

        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));

    }
    public static String delDel(String str) {
        if(str.startsWith("del", 1)){
            return str.charAt(0) + str.substring(4,str.length());
        }
        return str;
    }
}
