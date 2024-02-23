package Zadania.coodingbat.warmup2;

/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;
Biorąc pod uwagę ciąg znaków i nieujemną liczbę int n, powiemy, że początek łańcucha to pierwsze 3 znaki lub cokolwiek innego,
co tam się znajduje, jeśli ciąg jest krótszy niż 3. Zwróć n kopii początku;
        frontTimes("Chocolate", 2) → "ChoCho"
        frontTimes("Chocolate", 3) → "ChoChoCho"
        frontTimes("Abc", 3) → "AbcAbcAbc"*/

public class Zadanie2 {

    public static void main(String[] args) {

        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));

    }
    public static String frontTimes(String str, int n) {
        String result = "";
        String res = "";
        int liczba = str.length();
        switch (liczba){
            case 0:
            res = "";
            case 1:
            res = str.substring(0,1);
            break;
            case 2:
            res = str.substring(0,2);
            break;
            default:
              res = str.substring(0,3);
        }
        int i = 1;
        while(i<=n){
            result=result+res;
            i++;
        }
        return result;
    }
}
