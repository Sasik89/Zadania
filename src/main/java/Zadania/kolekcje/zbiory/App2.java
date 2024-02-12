package Zadania.kolekcje.zbiory;

import java.util.HashSet;
import java.util.TreeSet;

public class App2 {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("Janusz");
        set.add("Adam");
        set.add("Zbyszek");
        set.add("Bartek");

        System.out.println(set.size());

        System.out.println(set);

        set.remove("Janusz");

        System.out.println(set);

        String[] tablica = (String[]) set.toArray();

        for(String imie : set){
            System.out.println(imie);
        }

    }
}
