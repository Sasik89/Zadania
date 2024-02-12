package Zadania.coodingbat;


/*
Given a list of integers, return a list of the integers, omitting any that are less than 0.
noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
*/


import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {

        List<Integer> lista1 = List.of(1, -2);
        List<Integer> lista2 = List.of(-3, -3, 3, 3);
        List<Integer> lista3 = List.of(-1, -1, -1);

        System.out.println(noNeg(lista1));
        System.out.println(noNeg(lista2));
        System.out.println(noNeg(lista3));


    }
    public static List<Integer> noNeg(List<Integer> nums){
        List<Integer> nowaLista = new ArrayList<>();
        for(int number : nums){
            if(number>0){
                nowaLista.add(number);
            }
        }
        return nowaLista;
    }
}
