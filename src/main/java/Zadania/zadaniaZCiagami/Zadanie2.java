package Zadania.zadaniaZCiagami;

/*Program który wylicza n-ty element ciągu geometrycznego. Na wejściu program dostaje pierwszy wyraz ciągu,
 iloraz i numer wyrazu który ma wyliczyć. Krótka teoria jak działa ciąg geometryczny: Przykład:
        Wejście
        3 2 5
        Wynik
        48

        an=a1⋅qn−1
        an - wartość n-tego wyrazu ciągu
        a1 - wartosc poczatkowa ciagu,
        q - iloraz ciagu

        */

public class Zadanie2 {
    public static void main(String[] args) {

    WyrazCiaguGeometryczngo(3,5,2);

    }
    public static void WyrazCiaguGeometryczngo(int a, int n, int q){
        int an = (int) (a*Math.pow(q, (n-1)));
        System.out.println(an);
    }

}
