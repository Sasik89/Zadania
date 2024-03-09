package Zadania.coodingbat.mieszane;

/*Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
Biorąc pod uwagę listę nieujemnych liczb całkowitych, zwróć listę tych liczb, z wyjątkiem pomijania tych, które kończą się na 9. (Uwaga: % na 10)

        no9([1, 2, 19]) → [1, 2]
        no9([9, 19, 29, 3]) → [3]
        no9([1, 2, 3]) → [1, 2, 3]*/



import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {

        List<Integer> lista1 = List.of(1, 2, 19);
        List<Integer> lista2 = List.of(9, 19, 29, 3);
        List<Integer> lista3 = List.of(1, 2, 3);

        System.out.println(no9(lista1));
        System.out.println(no9(lista2));
        System.out.println(no9(lista3));

    }

    public static List<Integer> no9(List<Integer> nums) {
        List<Integer> nowaLista = new ArrayList<>();
        for(int number : nums){
            if(number!=9 && number%10!=9){
                nowaLista.add(number);
            }
        }
        return nowaLista;
    }
    }
