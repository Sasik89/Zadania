package Zadania.coodingbat.string3;

/*Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
(Note: Character.isLetter(char) tests if a char is a letter.)
Biorąc pod uwagę ciąg znaków, zwróć ciąg, w którym każde wystąpienie małej litery słowa „jest” zostało zastąpione przez „nie”.
Słowo „jest” nie powinno bezpośrednio poprzedzać ani po nim znajdować się litera – więc na przykład „is” w „this” się nie liczy.
(Uwaga: Character.isLetter(char) sprawdza, czy znak jest literą.)
        notReplace("is test") → "is not test"
        notReplace("is-is") → "is not-is not"
        notReplace("This is right") → "This is not right"*/

public class Zadanie11 {
    public static void main(String[] args) {

        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));

    }
    public static String notReplace(String str) {
        StringBuilder result = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1)) ||
                    i + 2 < len && Character.isLetter(str.charAt(i + 2))) {
                result.append(str.charAt(i));
            } else if (str.startsWith("is", i)) {
                result.append("is not");
                i += 1;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}

