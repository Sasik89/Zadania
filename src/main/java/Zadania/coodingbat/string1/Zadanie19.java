package Zadania.coodingbat.string1;

/*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
        middleThree("Candy") → "and"
        middleThree("and") → "and"
        middleThree("solving") → "lvi"*/

public class Zadanie19 {
    public static void main(String[] args) {

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));

    }
    public static String middleThree(String str) {
        double length = str.length();
        double middle = length/2;
        return str.substring((int) (middle-1.5),(int) (middle+1.5));
    }


}
