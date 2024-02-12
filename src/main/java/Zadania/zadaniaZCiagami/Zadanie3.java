package Zadania.zadaniaZCiagami;

/*
DLA CHĘTNYCH - trochę trudniejsze zadanie. Na wejściu program dostaje dowolny string który składa się tylko z liter a, b i c np. aaabbcbcbcbabab.
 Program ma zrobić redukcję tego stringa. Jak działa redukcja: ab i ba zamieniane jest na c, ac i ca zamieniane jest na b, bc i cb zamieniane jest na a.
 Program ma redukować stringa maksymalnie jak się da. Przykład: ababcbcbacab -> ccaabc -> cbcc -> acc -> bc -> a. Program wyświetla a.
 Możecie też sprawdzić co się stanie w takich sytuacjach:
        najpierw będziecie zamieniać pary ab i ba później ac i ca i na końcu bc i cb
        najpierw bc i cb, później ac i ca i na końcu ab i ba
        dowolna inna kombinacja kolejności.
*/

public class Zadanie3 {
    public static void main(String[] args) {

        String wyraz1 = "acabababcbacbabacbcbcbaaaccbabacbbabcbcbacbacbaabacbcbacbacbacbcbcbca";

       RedukcjaString(wyraz1);

       System.out.println(reduceString(wyraz1));
    }

    public static void RedukcjaString(String wyraz) {
        boolean redukcja = true;
        while (redukcja) {
            redukcja = false;
            wyraz = wyraz.replace("ab", "c").replace("ba", "c");
            wyraz = wyraz.replace("ac", "b").replace("ca", "b");
            wyraz = wyraz.replace("bc", "a").replace("cb", "a");
            System.out.println(wyraz);

            if(wyraz.contains("ab") || wyraz.contains("ba") ||
                    wyraz.contains("ac") || wyraz.contains("ca") ||
                    wyraz.contains("bc") || wyraz.contains("cb")) {
                redukcja = true;
            }
        }

        }


    public static String reduceString(String input) {
        boolean reductionPossible = true;

        while (reductionPossible) {
            reductionPossible = false;

            // Zamień pary ab i ba na c
            input = input.replace("ab", "c").replace("ba", "c");
            // Zamień pary ac i ca na b
            input = input.replace("ac", "b").replace("ca", "b");
            // Zamień pary bc i cb na a
            input = input.replace("bc", "a").replace("cb", "a");
            // Sprawdź, czy dalsza redukcja jest możliwa
            if (input.contains("ab") || input.contains("ba") ||
                    input.contains("ac") || input.contains("ca") ||
                    input.contains("bc") || input.contains("cb")) {
                reductionPossible = true;
            }
        }
        return input;
    }

    }
