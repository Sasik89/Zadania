package Zadania.nowosciWJavie.java10;

import java.util.List;
import java.util.Set;

public class KopiowanieKolekcji {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list);

        List<Integer> list2 = List.copyOf(list);

        Set<String> set = Set.of("sas", "fdsfd", "gds");
        Set<String> set2 = Set.copyOf(set);
     }
}
