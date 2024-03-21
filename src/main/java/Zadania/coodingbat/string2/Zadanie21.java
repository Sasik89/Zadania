package Zadania.coodingbat.string2;

/*Given a string and a non-empty word string, return a string made of each char just before and just after every appearance
 of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice
 if it is between two words.
 Biorąc pod uwagę ciąg znaków i niepusty ciąg słów, zwróć ciąg znaków utworzony z każdego znaku tuż przed i tuż po każdym wystąpieniu
 słowa w ciągu. Ignoruj przypadki, w których przed lub po słowie nie ma znaku, a znak może pojawić się dwukrotnie
 jeśli jest pomiędzy dwoma słowami.
        wordEnds("abcXY123XYijk", "XY") → "c13i"
        wordEnds("XY123XY", "XY") → "13"
        wordEnds("XY1XY", "XY") → "11"*/

public class Zadanie21 {
    public static void main(String[] args) {

        // TODO: 21.03.2024 Przy sprawdzaniu na coddingBat w dwóch przypadkach nie działa
        
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));

    }

    public static String wordEnds(String str, String word) {
        String result = str.replaceAll(word, "*");
        StringBuilder stringBuilder = new StringBuilder();
        if(str.length()==0){
            return str;
        }
        if(str.equals(word)){
            return "";
        }
        if (result.charAt(0) == '*' && result.charAt(1) != '*') {
            stringBuilder.append(result.charAt(1));
        }  if (result.charAt(0) != '*' && result.charAt(1) == '*') {
            stringBuilder.append(result.charAt(0));
        }
        for (int i = 1; i < result.length()-1; i++) {
            if (result.charAt(i) != '*' && (result.charAt(i + 1) != '*')) {
                stringBuilder.append("");
            } else if (result.charAt(i) != '*' && result.charAt(i + 1) == '*') {
                stringBuilder.append(result.charAt(i));
            } else if (result.charAt(i) == '*' && result.charAt(i + 1) == '*') {
                stringBuilder.append("");
            } else if (result.charAt(i) == '*' && result.charAt(i + 1) != '*') {
                stringBuilder.append(result.charAt(i+1));
            }
        }
      return stringBuilder.toString();
    }
}
