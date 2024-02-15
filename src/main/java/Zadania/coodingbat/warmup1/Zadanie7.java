package Zadania.coodingbat.warmup1;

/*Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
Biorąc pod uwagę ciąg, zwróć nowy ciąg, w którym na początku dodano „nie”.
Jeśli jednak ciąg zaczyna się już od „nie”, zwróć ciąg bez zmian. Uwaga: użyj .equals() do porównania 2 ciągów znaków.
        notString("candy") → "not candy"
        notString("x") → "not x"
        notString("not bad") → "not bad"*/

public class Zadanie7 {
    public static void main(String[] args) {

        System.out.println(notString("candy"));
        System.out.println(notString("is not"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));

    }
    public static String notString(String str) {
        if(str.contains("not") && str.startsWith("not")){
            return str;
        }
        if(str.contains("not") && !str.startsWith("not")) {
            return "not " + str;
        }
        else {
            return "not "+ str;
        }
    }
}
