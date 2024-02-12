package Zadania.Strumenie;

import java.util.Arrays;
import java.util.List;


public class Zadanie8 {
    public static void main(String[] args) {

        List<Integer> list2 = Arrays.asList(34,345,657,23,46,2,1,5,7,88,34,212,2,456,7,89);

       // funkcja sumuje elementy

      int sum =  list2.stream()
                .reduce(0, (acc, element) -> acc + element);

        System.out.println(sum);

    }
}
