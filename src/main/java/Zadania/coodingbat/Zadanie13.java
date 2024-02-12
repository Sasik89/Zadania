package Zadania.coodingbat;


/*Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
Biorąc pod uwagę listę liczb całkowitych, zwróć listę, w której każda liczba całkowita jest dodawana do 1, a wynik jest mnożony przez 10.

        math1([1, 2, 3]) → [20, 30, 40]
        math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
        math1([10]) → [110]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie13 {
    public static void main(String[] args) {

    List<Integer> lista1 = List.of(1, 2, 3);
    List<Integer> lista2 = List.of(6, 8, 6, 8, 1);
    List<Integer> lista3 = List.of(10);

    math1(lista1);
    math1(lista2);
    math1(lista3);

    }
    public static List<Integer> math1(List<Integer> nums) {
        List<Integer> lista = new ArrayList<>();
        for(int element: nums){
            lista.add((element+1)*10);
        }
        return lista;
    }
}
