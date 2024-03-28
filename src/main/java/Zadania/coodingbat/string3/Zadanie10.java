package Zadania.coodingbat.string3;



/*Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.)
        sumNumbers("abc123xyz") → 123
        sumNumbers("aa11b33") → 44
        sumNumbers("7 11") → 18*/

public class Zadanie10 {
    public static void main(String[] args) {

        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));

        System.out.println(sumNumbers2("abc123xyz"));
        System.out.println(sumNumbers2("aa11b33"));
        System.out.println(sumNumbers2("7 11"));


    }


    //wykorzystanie Exception
    public static int sumNumbers(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
            if ((!Character.isDigit(str.charAt(i)))) {
                stringBuilder.append(" ");
            }
        }
        String[] result = stringBuilder.toString().split(" ");
        for (String element : result) {
            try {
                Integer.parseInt(element);
                sum = sum + Integer.parseInt(element);
            } catch (NumberFormatException e) {
            }
        }
        return sum;
    }

    //wykorzystanie regex
    public static int sumNumbers2(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
            if ((!Character.isDigit(str.charAt(i)))) {
                stringBuilder.append(" ");
            }
        }
        String[] result = stringBuilder.toString().split(" ");
        for (String element : result) {
            if(element.matches("\\d+")){
                sum = sum + Integer.parseInt(element);
            }
        }
        return sum;
    }
}