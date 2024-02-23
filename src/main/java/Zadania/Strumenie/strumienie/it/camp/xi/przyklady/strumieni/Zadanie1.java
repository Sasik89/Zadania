package Zadania.Strumenie.strumienie.it.camp.xi.przyklady.strumieni;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

//Zamień strumień na strumień intów i wylicz średnią
public class Zadanie1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,5,6,13,7,8,9,2,6,2,13,15);

        Optional<Double> srednia = Optional.of(list.stream().mapToInt(i -> i).average().getAsDouble());
        System.out.println(srednia.get());
    }


}
