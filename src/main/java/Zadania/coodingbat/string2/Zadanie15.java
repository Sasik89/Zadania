package Zadania.coodingbat.string2;


/*A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string,
or return the empty string "" if there are not two pieces of bread.
        getSandwich("breadjambread") → "jam"
        getSandwich("xxbreadjambreadyy") → "jam"
        getSandwich("xxbreadyy") → ""*/

public class Zadanie15 {
    public static void main(String[] args) {


        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
        System.out.println(getSandwich("breadbreadbreadbread"));

    }

    public static String getSandwich(String str) {
        String str2 = str.replaceFirst("bread", "*");
        int firstBrand = 0;
        int lastBread = 0;
        char[] str3 = str2.toCharArray();
        for (int i = 0; i < str2.length() - 4; i++) {
            if (str2.substring(i, i + 5).equals("bread")) {
                lastBread = i;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str3[i] == '*') {
                firstBrand = i;
            }
        }
        if (firstBrand > lastBread || !str.contains("bread")) {
            return "";
        } else {
            return str2.substring(firstBrand+1, lastBread);
        }
    }
}