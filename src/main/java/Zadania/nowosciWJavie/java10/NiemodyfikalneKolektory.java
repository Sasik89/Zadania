package Zadania.nowosciWJavie.java10;

import java.util.List;
import java.util.stream.Collectors;

public class NiemodyfikalneKolektory {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,8);
        list.stream().collect(Collectors.toUnmodifiableList());

    }
}
