/*Mamy liste intów, szukamy tylko intów większych od 3 i mniejszych od 10
* bez duplikatów. Chcemy wypisać tylko pierwszą znalezioną liczbę w postaci: x      */

package Zadania.Strumenie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,7,2,5,8,2,44,82,16,89,23,78,22,1,4,6,8,2,47,9,3);


        list.stream()
                .filter(x -> x > 3)             //przepuszcza tylko te większe od 3
                .filter(x -> x < 10)            //przepszucza tylko te mniejsze od 10
                .distinct()                     //usuwa duplikaty
                .limit(1)               //pzepuszcza tylo 1 liczbe
                .map(i -> "Liczba: " + i)       //mapujemy do Stringa żeby dodać słowo "Liczba: "
                .forEach(System.out::println);

   //lub

        Optional<String> stringBox = list.stream()
                .filter(x -> x > 3)
                .filter(x -> x < 10)
                .distinct()
                .limit(1)
                .map(i -> "Liczba: " + i)
                .findFirst();

        System.out.println(stringBox.get());

    }


}
