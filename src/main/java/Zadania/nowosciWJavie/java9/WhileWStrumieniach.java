package Zadania.nowosciWJavie.java9;

import java.util.List;

public class WhileWStrumieniach {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,8);
        list.stream()
                .dropWhile(i -> i<3)
                .takeWhile(i->i>4)
                .toList();
    }
}
