package Zadania.coodingbat.string3;

/*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
        Return true if all the g's in the given string are happy.
        gHappy("xxggxx") → true
        gHappy("xxgxx") → false
        gHappy("xxggyygxx") → false*/

public class Zadanie4 {
    public static void main(String[] args) {

        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
        System.out.println(gHappy("xxggyygxx"));
        System.out.println(gHappy("xxgggxyg"));

    }
    public static boolean gHappy(String str) {
        boolean result=false;
        if(str.length()<=0){
            result=true;
        }
        if(str.length()>=2 && str.charAt(0)=='g' && str.charAt(1)=='g'){
            result = true;
        }
        for(int i=1; i<str.length()-1;i++){
            if(str.charAt(i) == 'g' && (str.charAt(i-1) == 'g' || str.charAt(i+1) == 'g'))
                result = true;
            }
        for(int i=1; i<str.length()-1;i++){
            if(str.charAt(i) == 'g' && (str.charAt(i-1) != 'g' & str.charAt(i+1) != 'g'))
                result = false;
        }
        if(str.length()>=2 && str.charAt(str.length()-1)=='g' && str.charAt(str.length()-2)!='g'){
            result = false;
        }
        return result;
    }
}
