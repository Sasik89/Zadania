package Zadania.coodingbat.warmup1;

/*Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
Biorąc pod uwagę niepusty ciąg znaków i int n, zwróć nowy ciąg znaków, w którym usunięto znak o indeksie n.
Wartość n będzie prawidłowym indeksem znaku w oryginalnym ciągu (tj. n będzie należeć do zakresu 0..str.length()-1 włącznie).

        missingChar("kitten", 1) → "ktten"
        missingChar("kitten", 0) → "itten"
        missingChar("kitten", 4) → "kittn"*/

public class Zadanie8 {
    public static void main(String[] args) {

        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));

    }

    public static String missingChar(String str, int n) {
        int length = str.length();
            if(n == 0){
                return str.substring(1,length);
            } else{
                return str.substring(0,n) + str.substring(n+1,length);
            }
    }
}
