package Zadania.coodingbat.string2;


/*Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
        So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
        starOut("ab*cd") → "ad"
        starOut("ab**cd") → "ad"
        starOut("sm*eilly") → "silly"*/

public class Zadanie19 {
    public static void main(String[] args) {

        // TODO: 21.03.2024 Słabo działa

        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));

        // TODO: 21.03.2024 Nie działa jeden wariant

        System.out.println(starOut2("ab*cd"));
        System.out.println(starOut2("ab**cd"));
        System.out.println(starOut2("sm*eilly"));
        System.out.println(starOut2("*stringy"));
        System.out.println(starOut2("sm***eil*ly"));

    }

    public static String starOut(String str) {
        StringBuilder resutl = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - 2) {
                if (str.charAt(i + 1) == '*' && str.charAt(i + 2) != '*') {
                    resutl.append("");
                    i = i + 3;
                } else if (str.charAt(i + 1) == '*' && str.charAt(i + 2) == '*') {
                    resutl.append("");
                    i = i + 4;
                }
            }
            resutl.append(str.charAt(i));
        }
        return resutl.toString();
    }

    public static String starOut2(String str) {
        int start = 1;
        StringBuilder result = new StringBuilder();
        if (!str.contains("*")) {
            return str;
        }
        if (str.charAt(0) == '*') {
            result.append("");
        }
        for (int i = start; i < str.length(); i++) {
            if (str.charAt(i) != '*' && (str.charAt(i - 1) != '*')) {
                result.append(str.charAt(i - 1));
            } else if (str.charAt(i) == '*' && (str.charAt(i - 1) != '*')) {
                result.append("");
            } else if (str.charAt(i) == '*' && str.charAt(i - 1) == '*') {
                result.append("");
                i = i + 2;
            } else if (str.charAt(i) != '*' && str.charAt(i - 1) == '*') {
                result.append("");
                i = i + 1;
            }
        }
        if (str.charAt(str.length() - 1) != '*' && str.charAt(str.length() - 2) != '*') {
            result.append(str.charAt(str.length() - 1));
        }
        return result.toString();
    }

}
