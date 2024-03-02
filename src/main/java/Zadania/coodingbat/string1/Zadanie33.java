package Zadania.coodingbat.string1;

/*Given a string, if one or both of the first 2 chars is 'x',
return the string without those 'x' chars, and otherwise return the string unchanged.
This is a little harder than it looks.
        withoutX2("xHi") → "Hi"
        withoutX2("Hxi") → "Hi"
        withoutX2("Hi") → "Hi"*/

public class Zadanie33 {
    public static void main(String[] args) {

        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));

    }
    public static String withoutX2(String str) {
        if(str.length()==0){
            return "";
        }
        else if(str.length()==1 && str.substring(0,1).contains("x")){
            return str.replace("x","");
        }
        else if(str.length()>=2 && str.substring(0,2).contains("x")){
            return str.substring(0,2).replace("x","") + str.substring(2,str.length());
        }
        return str;
    }

}
