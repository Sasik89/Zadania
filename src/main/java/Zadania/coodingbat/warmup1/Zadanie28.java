package Zadania.coodingbat.warmup1;

/*Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.
Biorąc pod uwagę ciąg, zwróć nowy ciąg, w którym ostatnie 3 znaki są teraz wielkimi literami.
Jeśli ciąg ma mniej niż 3 znaki, wpisz wielkie litery, cokolwiek tam jest.
Należy pamiętać, że funkcja str.toUpperCase() zwraca ciąg znaków zapisany wielkimi literami.

        endUp("Hello") → "HeLLO"
        endUp("hi there") → "hi thERE"
        endUp("hi") → "HI"*/

public class Zadanie28 {
    public static void main(String[] args) {

        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));


    }
    public static String endUp(String str) {
        int strLength = str.length();
        if(strLength<=3){
         return str.toUpperCase();
        } else {
          return str.substring(0,strLength-3) + str.substring(strLength-3, strLength).toUpperCase();
        }
    }

}
