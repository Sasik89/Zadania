package Zadania.kolekcje.listy;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Janusz");

        System.out.println(lista.size()); //sprawdza wielkość listy

        lista.add("Wiesiek");
        lista.add("Zbyszek");

        System.out.println(lista.size());

        System.out.println(lista);

        System.out.println(lista.get(1));

        lista.add(1, "Karol"); //dodaje w konkretny indeks wartość jednocześnie rozszerzając listę

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Czesiek");
        lista2.add("Konstanty");

        lista.addAll(lista2);

        System.out.println(lista);

        System.out.println(lista.contains("Wiesiek")); //sprawdza czy lista zawiera "Wieska"

        lista.remove("Zbyszek"); //usuwa obiekt o imieniu "Zbyszek"

        lista.remove(1); //usuwa obiekt z 1 indeksu

        System.out.println(lista.isEmpty()); //sprawdza czy lista jest pusta

        lista.set(1,"Wiesiek"); //podmienia wartość usuwajac to co dotychczas było pod indeksem 1

        lista.subList(1,5); //wyciąga elementy w damym przedziale

        lista.toArray(); //zmienia listę na tablicę

    }
}
