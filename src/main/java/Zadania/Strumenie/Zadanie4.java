/*Znajdz klientów których imie to Janusz i zmień mu nazwisko na X*/

package Zadania.Strumenie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) {
        List<Client> list = new ArrayList<>();
        list.add(new Client("Janusz", "Kowalski"));
        list.add(new Client("Zbyszek", "Malinowski"));
        list.add(new Client("Wiesiek", "Jakiś"));
        list.add(new Client("Mateusz", "Bereda"));


        list.stream()
                .filter(c-> c.getName().equals("Janusz")) //szuka Clientów których imie zaczyna się na "Janusz"
                .forEach(c -> c.setSurname("X")); //ustawia nazwisko na "X"

        //konsumer to jest funkcja która ma coś zrobić

        System.out.println(list);
    }
}
