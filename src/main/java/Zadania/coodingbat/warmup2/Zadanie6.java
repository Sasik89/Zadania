package Zadania.coodingbat.warmup2;

/*Given a non-empty string like "Code" return a string like "CCoCodCode".
Biorąc pod uwagę niepusty ciąg, taki jak „Kod”, zwróć ciąg taki jak „CCoCodCode”.

        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"*/

public class Zadanie6 {
    public static void main(String[] args) {

        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));

    }
    public static String stringSplosion(String str) {
        String result = "";
        // On each iteration, add the substring of the chars 0..i
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }
}
