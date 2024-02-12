package Zadania.kolekcje.mapy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(6, "Zbyszek");
        hashMap.put(7, "Janusz");
        hashMap.put(8, "Wiesiek");

        System.out.println(hashMap.get(5));
        System.out.println(hashMap.get(7));

        HashMap<String, Double> innaMapa = new HashMap<>();
        innaMapa.put("Wiesiek", 55.54);
        innaMapa.put("Janusz", 58.54);
        innaMapa.put("Zbyszek", 51.54);

        System.out.println(innaMapa.get("Wiesiek"));

        HashMap<Integer, Pet> petMapa = new HashMap<>();
        petMapa.put(1,new Pet("Reksio",1,6, "Pan Karol"));
        Pet pies = petMapa.get(1);
        System.out.println(pies.name);
        System.out.println(pies.id);
        System.out.println(pies.owner);
        System.out.println(pies.age);

        System.out.println(hashMap.size()); //zwraac ilos par

        Set<Integer> set = hashMap.keySet(); //zwraca tablicę setów
        System.out.println(set);

        Collection<String> values = hashMap.values(); //zwraca kolikcję wartość
        System.out.println(values);

        Set<Map.Entry<Integer, String>> zbiorPar = hashMap.entrySet(); //zwraca zbior par, czyli obiektów Entry
        //chcąc je przeiterować podajemy jako typ obiektu obiekt typu Entry, który ma wartosci typu Integer oraz, String

        for(Map.Entry<Integer, String> para : zbiorPar){
            System.out.println(para.getKey() + " - " + para.getValue());
        }

    }
}
