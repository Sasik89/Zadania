package Zadania.coodingbat.warmup1;

/*Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
Biorąc pod uwagę 2 dodatnie wartości int, zwróć większą wartość z zakresu 10–20 włącznie lub zwróć 0, jeśli żadna z nich nie należy do tego zakresu.

        max1020(11, 19) → 19
        max1020(19, 11) → 19
        max1020(11, 9) → 11*/

import java.util.Arrays;
import java.util.List;

public class Zadanie25 {
    public static void main(String[] args) {

        System.out.println(max1020(11,19));
        System.out.println(max1020(19,11));
        System.out.println(max1020(11,9));

    }
    public static int max1020(int a, int b) {
        List<Integer> lista = Arrays.asList(a,b);
        if(a<10 | a>20 && b<10 | b>20){
            return 0;
        }
        return lista.stream().filter(number-> number<=20).max(Integer::compareTo).get();
    }
}
