package Zadania.Strumenie.strumienie.it.camp.xi.przyklady.strumieni;

import java.util.List;

public class Zadanie8 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,5,6,13,7,8,9,2,6,2,13,15);

        list.stream().reduce(0, (acc, element)->acc+element); //dodaje do Siebie liczby

        list.stream().reduce(1, (acc, element) ->acc*element); //przemnaża kolejne liczby przez Siebie

        list.stream().reduce(0, (acc, element)->acc+1); //zlicza liczbę elementów w zbiorze

    }
}
