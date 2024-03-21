package Zadania.coodingbat.string2;


/*Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
        oneTwo("abc") → "bca"
        oneTwo("tca") → "cat"
        oneTwo("tcagdo") → "catdog"*/

public class Zadanie17 {
    public static void main(String[] args) {

        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
        System.out.println(oneTwo("abcdefx"));


    }
    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        int length = (int) Math.floor(str.length() / 3);
        for (int i = 0; i < length; i++) {
            result.append(str.substring(i * 3 + 1, (i * 3 + 3)))
                    .append(str.substring(i*3, (i * 3) + 1));

        }
        return result.toString();
/*        if (str.length() % 3 != 0) {
            int end1 = (length) * 3;
            int end2 = str.length();
            result.append(str.substring(end1, end2));
            return result.toString();
        } else {
            return result.toString();
        }*/
    }
}
