package Zadania.Strumenie.strumienie.it.camp.xi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        Stream<Integer> strumien = list.stream();
        strumien.forEach(System.out::println);
        //strumien.forEach(i-> System.out.println("Zapisałem do bazy"));

        List<Integer> kolekcja = strumien.toList();

        Optional<Integer> maxBox = strumien.max((i1, i2) -> i1-i2);
        System.out.println(maxBox.get());

        long count = strumien.count();
        System.out.println(count);

        Optional<Integer> first = strumien.findFirst();
        System.out.println(first);

        Optional<Integer> firstAny = strumien.findAny();
        System.out.println(firstAny);

        boolean resulst = strumien.allMatch(i->i>0);
        System.out.println(resulst);

        list.stream().limit(3).forEach(System.out::println);

        list.stream().skip(3).forEach(System.out::println);

        list.stream().distinct().forEach(System.out::println);

        list.stream().sorted().forEach(System.out::println);

        list.stream().filter(i-> i<5).forEach(System.out::println);

        list.stream().dropWhile(i-> i<5).forEach(System.out::println);

        list.stream().takeWhile(i-> i<5).forEach(System.out::println);

        list.stream().peek(System.out::println).toList();

        List<String> list1 = list.stream()
                .map(i-> "Liczba: "+ i)
                .toList();
    }
}
