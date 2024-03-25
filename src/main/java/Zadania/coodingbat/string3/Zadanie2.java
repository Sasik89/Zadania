package Zadania.coodingbat.string3;


/*Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
        withoutString("Hello there", "llo") → "He there"
        withoutString("Hello there", "e") → "Hllo thr"
        withoutString("Hello there", "x") → "Hello there"*/

public class Zadanie2 {
    public static void main(String[] args) {

        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));

    }
    public static String withoutString(String base, String remove) {
        StringBuilder stringBuilder = new StringBuilder();
        int lenfthOfRemove = remove.length();
        for(int i =0; i<base.length();i++){
            if(i<=base.length()-lenfthOfRemove && base.substring(i,i+lenfthOfRemove).toLowerCase().equals(remove.toLowerCase())){
                i=i+lenfthOfRemove-1;
            } else {
                stringBuilder.append(base.substring(i,i+1));
            }
        }
        return stringBuilder.toString();
    }


}
