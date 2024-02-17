package Zadania.coodingbat.warmup1;

/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
Biorąc pod uwagę ciąg, zwróć ciąg składający się z pierwszych 2 znaków (jeśli jest obecny),
jednakże dołącz pierwszy znak tylko wtedy, gdy jest to „o”, a drugi tylko wtedy, gdy jest to „z”, więc „ozymandias” daje „oz”.

        startOz("ozymandias") → "oz"
        startOz("bzoo") → "z"
        startOz("oxx") → "o"
*/

public class Zadanie21 {
    public static void main(String[] args) {

        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));


    }
    public static String startOz(String str) {
        char[] tablica = str.toCharArray();
        if(tablica[0] == 'o' && tablica[1] == 'z'){
            return "oz";
        } else if(tablica[0] == 'o') {
            return "o";
        }
        else if(tablica[1] == 'z'){
            return "z";
        } else{
            return "";
        }
    }
}
