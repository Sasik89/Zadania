package Zadania.Strumenie.strumienie.it.camp.xi.przyklady.strumieni;

//Mamy listę imion, Usuń wszystkie imiona zaczynajace się na literę "A",
//Pozostale imiona wypisz w kolejnosci alfabetycznej tylko z małymi literami.


import java.util.Arrays;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ania", "Adam", "Wiesiek", "Mateusz", "Zbyszek", "Alfred", "Karol");

        displayNames(list);

    }

    public static void displayNames(List<String> lista){
        lista.stream()
                .filter(s->!s.startsWith("A")) //usuwamy stringi które zaczynają się na literę "A"
                .sorted() //sortujemy alfabetycznie
                .map(s->s.toLowerCase())  //ze względu na to że Stringi nie są mutowalne, mapujemy Stringi czli tworzymy nowe które będą z małej litery
                .forEach(s -> System.out.println(s)); //wyświetlamy je.
    }
}
