package Zadania.coodingbat.string2;


/*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
Poszukaj wzorców takich jak „zip” i „zap” w ciągu znaków o długości 3, zaczynając od „z” i kończąc na „p”.
Zwraca ciąg znaków, w którym we wszystkich takich słowach nie ma środkowej litery, więc „zipXzap” zwraca „zpXzp”.
    zipZap("zipXzap") → "zpXzp"
    zipZap("zopzop") → "zpzp"
    zipZap("zzzopzop") → "zzzpzp"*/

public class Zadanie18 {
    public static void main(String[] args) {

        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
        System.out.println(zipZap("abcppp"));

    }
    public static String zipZap(String str) {
        StringBuilder result = new StringBuilder();
        if(str.length()<=2){
            return str;
        }
        for(int i=0; i<str.length()-2;i++){
            if(str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                result.append(str.charAt(i))
                        .append(str.charAt(i+2));
                i=i+2; //jeśli występuje wyraz w stylu "z*p" wówczas iteracje przeskakuje o dwa (łącznie 3) indeksy.
            } else {
                result.append(str.substring(i,i+1));
            }
        }
        if(str.charAt(str.length()-3) !='z' || str.charAt(str.length()-1) !='p'){ //jeżeli na końcu nie ma wyrażenia "z*p"wówczas musimy dodać dwie ostatnie litery do rezultatu.
            result.append(str.charAt(str.length()-2)).append(str.charAt(str.length()-1));
        }
        return result.toString();
    }
}
