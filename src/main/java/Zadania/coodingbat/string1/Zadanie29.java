package Zadania.coodingbat.string1;

/*Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
Biorąc pod uwagę ciąg znaków, jeśli na jego początku i na końcu pojawia się podciąg o długości 2, zwróć ciąg znaków bez podciągu na początku, tak aby „HelloHe” dało „lloHe”.
Podciąg może nakładać się na siebie, więc „Hi” daje „”. W przeciwnym razie zwróć oryginalny ciąg znaków bez zmian.
        without2("HelloHe") → "lloHe"
        without2("HelloHi") → "HelloHi"
        without2("Hi") → ""*/

public class Zadanie29 {
    public static void main(String[] args) {

        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));

        // TODO: 02.03.2024 Nie działa 

    }
    public static String without2(String str) {
        
        
        return "";

    }

}
