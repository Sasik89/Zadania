package Zadania.nowosciWJavie.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MetodyFabrykujace {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        //metoda fabrykujaca

        List<Integer> list2 = List.of(1,2,3,4,5);

        metoda(1,2,5,6,7);

        Set<Integer> set = Set.of(1,2,3);
        System.out.println(set);
        Set<String> set2 = Set.of("ja", "dupa");
        System.out.println(set2);

        Map<Integer, String> map = Map.of(1, "V1", 2,"V2");
        System.out.println(map);

        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1,"v1"),
                Map.entry(2,"v1"),
                Map.entry(3,"v1"),
                Map.entry(4,"v1"),
                Map.entry(5,"v1"),
                Map.entry(6,"v1"),
                Map.entry(7,"v1"));
    }

    public static void metoda(int...x){
        System.out.println(x[2]);
    }


}
