package Zadania.coodingbat.logic2;

/*Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
so the difference between small and medium is the same as the difference between medium and large.
        evenlySpaced(2, 4, 6) → true
        evenlySpaced(4, 6, 2) → true
        evenlySpaced(4, 6, 3) → false*/

import java.util.List;
import java.util.Optional;

public class Zadanie8 {
    public static void main(String[] args) {

        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));

    }

    public static boolean evenlySpaced(int a, int b, int c) {
        List<Integer> array = List.of(a, b, c);
        Integer minValue = array.stream()
                .min(Integer::compareTo)
                .orElseThrow();
        Integer maxValue = array.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        Integer medium = array.stream().sorted().skip(1).findAny().orElseThrow();
        if ((minValue - medium) == (medium - maxValue)){
            return true;
        } else {
            return false;
        }
    }
}
