package Zadania.coodingbat.string3;


/*Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances
        of "not" anywhere in the string (case sensitive).
        equalIsNot("This is not") → false
        equalIsNot("This is notnot") → true
        equalIsNot("noisxxnotyynotxisi") → true*/

public class Zadanie3 {
    public static void main(String[] args) {

        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
        System.out.println(equalIsNot("isnotis"));

    }

    public static boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;

        for(int i=0; i<=str.length()-2;i++){
            if(str.substring(i,i+2).equals("is")){
                is++;
            }
        }
        for(int i=0; i<=str.length()-3;i++){
            if(str.substring(i,i+3).equals("not")){
                not++;
            }
        }
        if(not==is){
            return true;
        } else {
            return false;
        }
    }
}
