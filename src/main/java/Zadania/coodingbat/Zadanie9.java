/*

Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

Mając n >= 0, utwórz tablicę o długości n*n według następującego wzorca,
 pokazanego tutaj dla n = 3: {  0, 0, 1,
                                0, 2, 1,
                                3, 2, 1}
 (spacje dodane, aby pokazać 3 grupy).

        squareUp(3) →   [0, 0, 1,
                        0, 2, 1,
                        3, 2, 1]
        squareUp(2) → [0, 1,
                       2, 1]
        squareUp(4) → [0, 0, 0, 1,
                       0, 0, 2, 1,
                       0, 3, 2, 1,
                       4, 3, 2, 1]
*/

package Zadania.coodingbat;

public class Zadanie9 {
    public static void main(String[] args) {

        // TODO: 12.01.2024 Działa 

        squareUp(5);
        System.out.println("----------------");
        squareUp(2);
        System.out.println("----------------");
        squareUp(4);
        System.out.println("----------------");
        squareUp(8);

    }

    public static void squareUp(int k) {
        int[][] tablica = new int[k][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                tablica[i][j] = 0;
            }
        }
        int liczba_kolumn = 0;
        int liczba_wierszy = k-1;

        for(int i=liczba_wierszy; i>=0; i--){
            int liczba_poczatkowa = i+1;
            for(int j=liczba_kolumn; j<=liczba_wierszy; j++){
                tablica[i][j] = liczba_poczatkowa;
                liczba_poczatkowa--;
            } liczba_kolumn++;
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}
