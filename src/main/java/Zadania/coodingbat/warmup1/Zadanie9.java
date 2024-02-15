package Zadania.coodingbat.warmup1;

/*Given a string, return a new string where the first and last chars have been exchanged.
Biorąc pod uwagę ciąg, zwróć nowy ciąg, w którym zamieniono pierwszy i ostatni znak.
        frontBack("code") → "eodc"
        frontBack("a") → "a"
        frontBack("ab") → "ba"*/

public class Zadanie9 {
    public static void main(String[] args) {

        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));

    }

    public static String frontBack(String str) {
        char[] tablica = str.toCharArray();
        int dlugosc = str.length();
        if(dlugosc<=1){
            return str;
        } else{
            char[] result = new char[dlugosc];
            result[0] = tablica[dlugosc-1];
            result[dlugosc-1] = tablica[0];
          for(int i=1; i<dlugosc-1; i++){
              result[i] = tablica[i];
          }
          return String.valueOf(result);
        }
    }
}
