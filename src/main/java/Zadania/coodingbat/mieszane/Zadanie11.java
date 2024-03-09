/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note:
Math.abs(num) computes the absolute value of a number.

Biorąc pod uwagę trzy liczby całkowite, a b c, zwróć wartość true, jeśli jedna z wartości b lub c jest „bliska” (różni się od "a" co najwyżej o 1),
a druga jest „daleka”, różniąc się od obu pozostałych wartości o 2 lub więcej.
Uwaga: Math.abs(num) oblicza wartość bezwzględną liczby.

        closeFar(1, 2, 10) → true
        closeFar(1, 2, 3) → false
        closeFar(4, 1, 3) → true
*/

package Zadania.coodingbat.mieszane;



public class Zadanie11 {

    // TODO: 12.01.2024 Działa

    public static void main(String[] args) {

        int[] tabela1 = {1,2,10};
        int[] tabela2 = {1,2,3};
        int[] tabela3 = {4,1,3};

        closeFar(tabela1);
        closeFar(tabela2);
        closeFar(tabela3);

    }

    public static void closeFar(int[] tablica){
        boolean warunek1 = false;
        boolean warunek2 = false;
        if(Math.abs(tablica[0]-tablica[1])<=1 || Math.abs(tablica[0]-tablica[2])<=1){
            warunek1 = true;
        }
        if (Math.abs(tablica[1]-tablica[2])>=2 || Math.abs(tablica[0]-tablica[1])>=2) {
            warunek2 = true;
            }
        if(warunek2==warunek1) {
            System.out.println(true);
        } else System.out.println(false);
        }
    }

