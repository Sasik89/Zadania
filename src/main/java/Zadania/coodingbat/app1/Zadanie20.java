package Zadania.coodingbat.app1;


/*Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
Return a new array containing the first N elements from the two arrays.
The result array should be in alphabetical order and without duplicates.
A and B will both have a length which is N or more.
The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
Zacznij od dwóch tablic ciągów A i B, każdy z elementami w kolejności alfabetycznej i bez duplikatów.
Zwróć nową tablicę zawierającą N pierwszych elementów z dwóch tablic.
Tablica wyników powinna być ułożona w kolejności alfabetycznej i bez duplikatów.
Obydwa A i B będą miały długość N lub większą.
Najlepsze rozwiązanie „liniowe” polega na pojedynczym przejściu przez A i B, wykorzystując fakt, że są one ułożone w kolejności alfabetycznej, kopiując elementy bezpośrednio do nowej tablicy.

        mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
        mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
        mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]*/

import java.util.ArrayList;
import java.util.List;

public class Zadanie20 {
    public static void main(String[] args) {

        String[] tablica1 = {"a", "c", "z"};
        String[] tablica1a = {"b", "f", "z"};
        String[] tablica2 = {"a", "c", "z"};
        String[] tablica2a = {"c", "f", "z"};
        String[] tablica3 = {"f", "g", "z"};
        String[] tablica3a = {"c", "f", "g"};

        wyswietlacz(mergeTwo(tablica1,tablica1a,3));
        wyswietlacz(mergeTwo(tablica2,tablica2a,3));
        wyswietlacz(mergeTwo(tablica3,tablica3a,3));

    }
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        List<String> result = new ArrayList<>();
        for(char i = 'a'; i<='z';i++){
            for(String element : a){
                if(element.contains((String.valueOf(i)))){
                    result.add(element);
                }
            }
            for(String element : b){
                if(element.contains((String.valueOf(i)))){
                    result.add(element);
                }
            }
        }
        return result.stream().distinct().limit(n).toArray(String[]::new);
    }

    public static void wyswietlacz(String[] a){
        for(String element: a){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
