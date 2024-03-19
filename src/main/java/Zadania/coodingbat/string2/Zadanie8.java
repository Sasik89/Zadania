package Zadania.coodingbat.string2;

/*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
Powiemy, że ciąg znaków jest zrównoważony pod względem xy, jeśli dla wszystkich znaków „x” w ciągu znaków istnieje znak „y” gdzieś dalej w ciągu.
Zatem „xxy” jest zrównoważone, ale „xyx” nie. Jedno „y” może zrównoważyć wiele „x”. Zwraca wartość true, jeśli podany ciąg jest zrównoważony xy.
        xyBalance("aaxbby") → true
        xyBalance("aaxbb") → false
        xyBalance("yaaxbb") → false*/

public class Zadanie8 {
    public static void main(String[] args) {

        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));

    }

    public static boolean xyBalance(String str) {
        int x = 0;
        int y = 0;
        char[] arr = str.toCharArray();
        for (int i=0; i<str.length();i++){
            if(arr[i]=='x'){
                x = i;
            } if(arr[i]=='y'){
                y=i;
            }
        }
             if(y>x){
                 return true;
             }
             else {
                 return false;
             }
    }
}
