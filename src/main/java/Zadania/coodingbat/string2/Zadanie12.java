package Zadania.coodingbat.string2;


/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        repeatSeparator("This", "And", 2) → "ThisAndThis"
        repeatSeparator("This", "And", 1) → "This"*/

public class Zadanie12 {
    public static void main(String[] args) {

        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));

    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        if (word.length() >= 0 && sep.length() >= 0) {
            for (int i = 0; i <count; i++) {
                result.append(word);
                if (count-1 > i) {
                    result.append(sep);
                }

            }
        }
        return result.toString();
    }
}
