package Zadania.coodingbat.mieszane;

/*Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
Biorąc pod uwagę ciąg, zwróć długość największego „bloku” w ciągu. Blok to ciąg sąsiadujących ze sobą znaków, które są takie same.

        maxBlock("hoopla") → 2
        maxBlock("abbCCCddBBBxx") → 3
        maxBlock("") → 0
        */

public class Zadanie12 {
    public static void main(String[] args) {

        String slowo1 = "hoopla";
        String slowo2 = "abbCCCddBBBxx";
        String slowo3 = "";

        System.out.println(maxBlock(slowo1));
        System.out.println(maxBlock(slowo2));
        System.out.println(maxBlock(slowo3));

    }
    public static int maxBlock(String str) {
        char[] tablica = str.toCharArray();
        int max = 0;
        int temp = 1;
        for(int i = 1; i<str.length();i++){
            if(tablica[i] == tablica[i-1]){
                temp++;
            } else{
                temp = 1;
            }
            if(temp>=max){
                max = temp;
            }
        }
        return max;
    }

}
