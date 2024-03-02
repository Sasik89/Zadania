package Zadania.coodingbat.string1;

/*Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'.
The string may be any length. Harder than it looks.
Biorąc pod uwagę ciąg, zwróć wersję bez pierwszych 2 znaków. Z wyjątkiem zachowania pierwszego znaku, jeśli to „a”, i zachowania drugiego znaku, jeśli to „b”.
Ciąg może mieć dowolną długość. Trudniejsze niż się wydaje.
        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"*/

public class Zadanie30 {
    public static void main(String[] args) {

        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));

    }
    public static String deFront(String str) {
        if(str.length()>=2 && str.charAt(0)=='a' && str.charAt(1)=='b'){
            return str;
        } else if (str.length()>=2 && str.charAt(0)=='a' && str.charAt(1) != 'b') {
            return str.substring(0,1)+str.substring(2,str.length());
        } else if (str.length()>=2 && str.charAt(0)!='a' && str.charAt(1) == 'b' ) {
            return str.substring(1,str.length());
        } else if (str.length()>=2 && str.charAt(0)!='a' && str.charAt(1) != 'b') {
            return str.substring(2,str.length());
        }
        return str.substring(2,str.length());
    }
}
