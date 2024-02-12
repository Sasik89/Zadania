/*posortuj imiiona na te które zaczynają się od litery "a", następnie zamień je na imiona
z małej litery posortowane alfabetycznie*/

package Zadania.Strumenie;

import java.util.Arrays;
import java.util.List;

public class Zadanie2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ania", "Adam", "Wiesiek", "Zbyszek", "Alfred", "Karol");


    list.stream()
            .filter(s -> s.startsWith("A"))
            .sorted((s1, s2) -> s1.compareTo(s2))
            .map(s -> s.toLowerCase())
            .forEach(System.out::println);

    }
}
