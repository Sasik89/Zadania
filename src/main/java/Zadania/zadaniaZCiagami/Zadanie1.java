package Zadania.zadaniaZCiagami;

/*
Program który wylicza n-ty element ciągu arytmetycznego.
        Na wejściu program dostaje pierwszy wyraz ciągu, różnicę i numer wyrazu który ma wyliczyć.
        Krótka teoria jak działa ciąg arytmetyczny: an=a1+(n−1)⋅r
        gdzie:
        a1 - pierwszy wyraz ciągu
        n - element ciągu
        r - roznica pomiedzy liczbami

*/

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        WyrazCiagu(1, 5, 10);
        WyrazCiaguString();

    }

    public static void WyrazCiagu(int a, int n, int r){
        int an = a+(n-1)*r;
        System.out.println(an);
    }

    public static void WyrazCiaguString(){
        System.out.println("Podaj 3 liczby oddzielone spacjami, pierwsza to pierwszy element ciąg, druga to wyraz ciąg, trzeci to różnica ciągu");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] newWord = word.split(" ");
        int a = Integer.parseInt(newWord[0]);
        int n = Integer.parseInt(newWord[1]);
        int r = Integer.parseInt(newWord[2]);

        int an = a+(n-1)*r;
        System.out.println(an);

    }



}
