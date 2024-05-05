package Zadania.coodingbat.app1;


/*Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
        hasOne(10) → true
        hasOne(22) → false
        hasOne(220) → false*/

public class Zadanie8 {
    public static void main(String[] args) {

        System.out.println(hasOne(10));
        System.out.println(hasOne(22));
        System.out.println(hasOne(220));

    }

    public static boolean hasOne(int n) {
        String result = Integer.toString(n);
        if(result.contains("1")){
            return true;
        }
        return false;
    }

}
