package Zadania.coodingbat;


/*Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
Mając listę nieujemnych liczb całkowitych, zwróć listę tych liczb pomnożoną przez 2, pomijając dowolne liczby wynikowe kończące się na 2.

        two2([1, 2, 3]) → [4, 6]
        two2([2, 6, 11]) → [4]
        two2([0]) → [0]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {


        List<Integer> lista1 = List.of(1, 2, 3);
        List<Integer> lista2 = List.of(2, 6, 11);
        List<Integer> lista3 = List.of(0);

        System.out.println(two2(lista1));
        System.out.println(two2(lista2));
        System.out.println(two2(lista3));


    }

    public static List<Integer> two2(List<Integer> nums) {
        List<Integer> nowaLista = new ArrayList<>();
        for(int number : nums){
            if(number*2 != 2 && (number*2)%10!=2){
                nowaLista.add(number*2);
            }
        }
        return nowaLista;
    }

}