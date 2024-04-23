package Zadania.coodingbat.Array3;


/*Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
        squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
        squareUp(2) → [0, 1, 2, 1]
        squareUp(4) → [0, 0, 0, 1,
                       0, 0, 2, 1,
                       0, 3, 2, 1,
                       4, 3, 2, 1]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie6 {
    public static void main(String[] args) {

        wyswietlacz(squareUp(3));
        wyswietlacz(squareUp(2));
        wyswietlacz(squareUp(4));

    }
    public static int[] squareUp(int n) {
        List<Integer> result = new ArrayList<>();
        int end = n;
        int start = 0;
        while(start<n){
            for(int i = end-1; i>0;i--){
                result.add(0);
            }
            end--;
            start++;
            for(int i = start;i>0;i--){
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void wyswietlacz(int[] tab) {
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
