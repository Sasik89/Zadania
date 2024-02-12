package Zadania.coodingbat;

/*
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

Zwraca sumę liczb w tablicy, zwracając 0 dla pustej tablicy.
Z wyjątkiem tego, że liczba 13 jest bardzo pechowa, więc się nie liczy, a liczby, które występują bezpośrednio po 13, również się nie liczą.

        sum13([1, 2, 2, 1]) → 6
        sum13([1, 1]) → 2
        sum13([1, 2, 2, 1, 13]) → 6

        https://codingbat.com/prob/p127384
*/

import java.util.Arrays;

public class Zadanie5 {

    // TODO: 13.01.2024 Działa 
    
    public static void main(String[] args) {

        int[] tabela1 = {1,2,2,1};
        int[] tabela2 = {1,1};
        int[] tabela3 = {1,2,2,1,13};

        sum13(tabela1);
        sum13(tabela2);
        sum13(tabela3);

        sum13Stream(tabela1);
        sum13Stream(tabela2);
        sum13Stream(tabela3);

    }

    public static void sum13(int[] tablica){
       int sum = 0;
        for (int element: tablica) {
            if(element!=13){
                sum = sum + element;
            }
        }
        System.out.println("Suma wynosi: " +sum);
    }

    public static void sum13Stream(int[] tablica){
      String suma =  String.valueOf(Arrays.stream(tablica).filter(i-> i != 13).sum());
        System.out.println("Przefiltrowana suma wynosi: " + suma);
    }


}
