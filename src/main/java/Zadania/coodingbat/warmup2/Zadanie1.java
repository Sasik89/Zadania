package Zadania.coodingbat.warmup2;

/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
Biorąc pod uwagę ciąg znaków i nieujemną liczbę int n, zwraca większy ciąg znaków, będący n kopiami oryginalnego ciągu.
        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi"*/

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));

    }
    public static String stringTimes(String str, int n) {
        String result = "";
        int i = 1;
        while(i<=n){
            result = result + str;
            i++;
        }
        return result;
    }

}
