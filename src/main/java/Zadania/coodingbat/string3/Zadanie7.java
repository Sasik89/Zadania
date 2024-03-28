package Zadania.coodingbat.string3;


/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
Biorąc pod uwagę ciąg, zwróć najdłuższy podciąg, który pojawia się zarówno na początku, jak i na końcu ciągu, bez nakładania się. Na przykład sameEnds("abXab") to "ab"
        sameEnds("abXYab") → "ab"
        sameEnds("xx") → "x"
        sameEnds("xxx") → "x"
*/

public class Zadanie7 {
    public static void main(String[] args) {

        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));

    }
    public static String sameEnds(String string) {
        String result = "";
                   for(int i=1; i<=string.length()/2;i++){
                    if(string.substring(0,i).equals(string.substring(string.length()-i,string.length()))){
                        result = string.substring(0,i);
                }
            }
        return result;
    }
}
