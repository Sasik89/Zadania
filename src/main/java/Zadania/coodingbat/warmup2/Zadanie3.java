package Zadania.coodingbat.warmup2;

/*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
Policz liczbę „xx” w podanym ciągu. Powiemy, że nakładanie się jest dozwolone, więc „xxx” zawiera 2 „xx”.
        countXX("abcxx") → 1
        countXX("xxx") → 2
        countXX("xxxx") → 3*/

public class Zadanie3 {
    public static void main(String[] args) {

        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));

    }

    static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
        }
}
