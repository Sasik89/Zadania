package Zadania.coodingbat.Array3;

import java.util.ArrayList;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {

        List<Integer> tablica1 = new ArrayList<>(List.of(1, 2, 1, 1, 3));

        wyswietlaczListy(tablica1);
        remove(tablica1);
        wyswietlaczListy(tablica1);
        remove(tablica1);
        wyswietlaczListy(tablica1);
    }


    public static void remove(List<Integer> lista){
        List<Integer> clone = new ArrayList<>(lista);
        lista.clear();
        for(int i = 1; i<clone.size();i++){
            lista.add(clone.get(i));
        }
    }

    public static void wyswietlaczListy(List<Integer> lista){
        for(int element: lista){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
