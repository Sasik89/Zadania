package Zadania.coodingbat.string1;


/*Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
Biorąc pod uwagę ciąg znaków i drugi ciąg „słowo”, powiemy, że słowo pasuje do ciągu, jeśli pojawia się na początku ciągu,
z tą różnicą, że jego pierwszy znak nie musi pasować dokładnie.
W przypadku dopasowania zwróć przód ciągu lub w inny sposób zwróć pusty ciąg. Zatem w przypadku ciągu „hippo” słowo „hi” zwraca „hi”, a „xip” zwraca „hip”.
Słowo będzie miało długość co najmniej 1.
        startWord("hippo", "hi") → "hi"
        startWord("hippo", "xip") → "hip"
        startWord("hippo", "i") → "h"*/

public class Zadanie31 {
    public static void main(String[] args) {

        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));

        // TODO: 02.03.2024 Wspomogłem sie GPT

    }
    public static String startWord(String str, String word) {
        if (word.length() > str.length()) {
            return "";
        }
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }
}
