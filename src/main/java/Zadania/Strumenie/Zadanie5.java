/*Chcemy znależć z listy Intigerów drugą najmniejszą liczbę*/

package Zadania.Strumenie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zadanie5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,345,657,23,46,2,1,5,7,88,34,212,2,456,7,89);

     //sposób 1

        int min = list.stream()
                .min((i1, i2) -> i1-i2).get();

        int secondMin = list.stream()
                .filter(i -> i!= min)
                .min(Comparator.comparingInt(i ->i)).get();

        System.out.println(secondMin);

    //sposób2


        int second = list.stream()
                .sorted(Comparator.comparingInt(i->i))
                .skip(1)
                .findFirst().get();
        System.out.println(second);

    }
}

