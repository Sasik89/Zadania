package Zadania.coodingbat.app1;

/*
Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array,
the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.
Biorąc pod uwagę 2 tablice o tej samej długości zawierające ciągi, porównaj pierwszy ciąg w jednej tablicy z pierwszym ciągiem w drugiej tablicy,
od 2 do 2 i tak dalej. Policz, ile razy te 2 ciągi znaków są niepuste i zaczynają się od tego samego znaku. Ciągi mogą mieć dowolną długość, łącznie z 0.
        matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
        matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
        matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1*/

public class Zadanie12 {
    public static void main(String[] args) {


        String[] tablica1 = {"aa", "bb", "cc"};
        String[] tablica1a = {"aaa", "xx", "bb"};
        String[] tablica2 = {"aa", "bb", "cc"};
        String[] tablica2a = {"aaa", "b", "bb"};
        String[] tablica3 = {"aa", "bb", "cc"};
        String[] tablica3a = {"", "", "ccc"};

        System.out.println(matchUp(tablica1, tablica1a));
        System.out.println(matchUp(tablica2, tablica2a));
        System.out.println(matchUp(tablica3, tablica3a));

    }

    public static int matchUp(String[] a, String[] b) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
                if ((!a[i].isEmpty()) && (!b[i].isEmpty()) && (a[i].charAt(0) == b[i].charAt(0))) {
                    counter++;
                }
            }
        return counter;
    }
}
