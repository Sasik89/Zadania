/*

Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive
 -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n)
 {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
 Define the helper below and at the same indent level as the main noTeenSum().

 Biorąc pod uwagę 3 wartości int, a b c, zwróć ich sumę. Jeśli jednak którakolwiek z wartości jest nastolatkiem — w zakresie od 13 do 19 włącznie
 — wówczas ta wartość jest liczona jako 0, z wyjątkiem 15 i 16, które nie są liczone jako nastolatki. Napisz osobnego pomocnika „public int fixTeen(int n) {”
 , który przyjmuje wartość typu int i zwraca tę wartość ustaloną dla reguły nastolatków.
 W ten sposób unikniesz 3-krotnego powtórzenia kodu nastolatka (tzn. „dekompozycji”).
 Zdefiniuj pomocnika poniżej i na tym samym poziomie wcięcia, co główna funkcja noTeenSum().

        noTeenSum(1, 2, 3) → 6
        noTeenSum(2, 13, 1) → 3
        noTeenSum(2, 1, 14) → 3
*/

package Zadania.coodingbat;

public class Zadanie22 {

    // TODO: 12.01.2024 Działa 
    
    public static void main(String[] args) {


        int[] tablica1 = {1, 2, 3};
        int[] tablica2 = {2, 13, 1};
        int[] tablica3 = {2, 1, 14};

        noTeenSum(tablica1);
        noTeenSum(tablica2);
        noTeenSum(tablica3);

    }

    public static void noTeenSum(int[] tablica){
        int suma = 0;
        for (int entry:tablica) {
            if (entry == (15-16)) {
                suma = suma +entry;
            } else {
                if(entry<13){
                    suma = suma + entry;
                } else {
                    suma = suma +0;
            }
            }
        }
        System.out.println(suma);
    }

}
