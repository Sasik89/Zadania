package Zadania.coodingbat.Array3;


/*Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
Biorąc pod uwagę dwie tablice int posortowane w kolejności rosnącej, zewnętrzną i wewnętrzną, zwróć wartość true, jeśli wszystkie liczby w części wewnętrznej pojawiają się w części zewnętrznej.
Najlepszym rozwiązaniem jest tylko jedno „liniowe” przejście obu tablic, wykorzystując fakt, że obie tablice są już posortowane.
        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true*/

import java.util.Arrays;

public class Zadanie5 {

    // TODO: 23.04.2024 Działa 
    public static void main(String[] args) {

        int[] tablica1 = {1, 2, 4, 6};
        int[] tablica1a = {2, 4};
        int[] tablica2 = {1, 2, 4, 6};
        int[] tablica2a = {2, 3, 4};
        int[] tablica3 = {1, 2, 4, 4, 6};
        int[] tablica3a = {2, 4};
        int[] tablica4 = {2, 2, 2, 2, 2};
        int[] tablica4a = {2, 4};


        System.out.println(linearIn(tablica1,tablica1a));
        System.out.println(linearIn(tablica2,tablica2a));
        System.out.println(linearIn(tablica3,tablica3a));
        System.out.println(linearIn(tablica4,tablica4a));


    }
    public static boolean linearIn(int[] outer, int[] inner) {
        if(inner.length==0){
            return true;
        }
        boolean result = false;
            for(int i = 0; i<=inner.length-1;i++){
                for(int j = 0; j<=outer.length-1;j++){
                    if(inner[i]==outer[j]){
                        result=true;
                        break;
                    }
                    result=false;
            }
                if(!result){
                    return false;
                }
        }
            return result;
    }

}
