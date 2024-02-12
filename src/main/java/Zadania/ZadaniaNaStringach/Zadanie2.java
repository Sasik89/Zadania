package Zadania.ZadaniaNaStringach;


/*Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
This problem is harder than it looks.

Biorąc pod uwagę ciąg znaków, czy „xyz” pojawia się w środku ciągu?
Aby zdefiniować środek, powiemy, że liczba znaków po lewej i prawej stronie „xyz” musi różnić się co najwyżej o jeden.
Ten problem jest trudniejszy, niż się wydaje.

        xyzMiddle("AAxyzBB") → true
        xyzMiddle("AxyzBB") → true
        xyzMiddle("AxyzBBB") → false*/

import java.util.Arrays;

public class Zadanie2 {

    // TODO: 25.01.2024 Działa

    public static void main(String[] args) {

        String jeden = "AAxyzBB";
        String dwa = "AxyzBB";
        String trzy = "AxyzBBB";
        String cztery = "AxyBB";

        xyzMiddle(cztery);

    }

    public static void xyzMiddle(String slowo) {
        boolean warunek1 = slowo.contains("xyz");
        String regex = "xyz";
        int lewy = 0;
        int prawy = 0;
        if (!warunek1) {
            System.out.println("Słowo nie zawiera wyrażenia 'xyz'");
        } else {
            String noweSlowo = slowo.replaceAll("xyz", "1");
            int noweSlowo2 = noweSlowo.indexOf("1");
            for(int i = 0; i < noweSlowo2; i++){
                lewy++;
            }
            for(int i = noweSlowo.length()-1; i>noweSlowo2; i--){
                prawy++;
            }
            if(Math.abs(prawy-lewy) <=1){
                System.out.println(true);
            } else{
                System.out.println(false);
            }
        }
    }
}
