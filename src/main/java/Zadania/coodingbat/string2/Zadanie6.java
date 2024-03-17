package Zadania.coodingbat.string2;


/*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
        xyzThere("abcxyz") → true
        xyzThere("abc.xyz") → false
        xyzThere("xyz.abc") → true*/

public class Zadanie6 {
    public static void main(String[] args) {

        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));

    }
    public static boolean xyzThere(String str) {
        if(str.contains(".xyz") && !str.contains(".xyzxyz")){
            return false;
        } else if (str.contains("xyz")) {
            return true;
        } else {
            return false;
        }
    }
}
