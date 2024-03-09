/*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

Powiemy, że „potrójna” w łańcuchu to znak pojawiający się trzy razy z rzędu. Zwróć liczbę trójek w podanym łańcuchu. Trójki mogą się nakładać.

        countTriple("abcXXXabc") → 1
        countTriple("xxxabyyyycd") → 3
        countTriple("a") → 0
*/

package Zadania.coodingbat.mieszane;

import java.util.Arrays;
import java.util.List;

public class Zadanie25 {

    // TODO: 12.01.2024 Działa 
    
    public static void main(String[] args) {

    String slowo1 = "abcXXXabc";
    String slowo2 = "xxxabyyyycd";
    String slowo3 = "a";


        countTriple(slowo1);
        countTriple(slowo2);
        countTriple(slowo3);


    }

    public static void countTriple(String slowo){
        char[] tablica = slowo.toCharArray();
        int counter = 0;
        if(slowo.length() <3);
        else{
            for(int i = 0; i<slowo.length()-2; i++ ){ //ograniczyłem pętle by nie przechodziła po wierszach których nie ma
                if(Character.valueOf(tablica[i]).equals(Character.valueOf(tablica[i+1])) && (Character.valueOf(tablica[i]).equals(Character.valueOf(tablica[i+2])))){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}

//Metoda Character.valueOf(tablic[i] - zwraca rzeczywistą wartośc chara w tablicy, czyli literę.