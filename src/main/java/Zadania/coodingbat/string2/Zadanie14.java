package Zadania.coodingbat.string2;

/*Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to
the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
Biorąc pod uwagę ciąg znaków, czy „xyz” pojawia się w środku ciągu? Aby zdefiniować środek, powiemy, że liczba znaków do
lewy i prawy element „xyz” muszą różnić się co najwyżej o jeden. Ten problem jest trudniejszy, niż się wydaje.
        xyzMiddle("AAxyzBB") → true
        xyzMiddle("AxyzBB") → true
        xyzMiddle("AxyzBBB") → false*/

public class Zadanie14 {

    // TODO: 19.03.2024 Nie dokońca działa
    public static void main(String[] args) {

        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
        System.out.println(xyzMiddle("xyzxyzAxyzBxyzxyz"));

    }
    public static boolean xyzMiddle(String str) {
        String str2 = str.replace("xyz", "*");
        char[] str3 = str2.toCharArray();
        int middle=0;
        for(int i=0; i<str2.length(); i++){
            if(str3[i]=='*'){
                middle=i;
            }
        }
        if(!str.contains("xyz")){
            return false;
        }
        if(Math.abs((middle-0)-(str2.length()-middle-1))<=1){
            return true;
        }
        return false;
    }

}
