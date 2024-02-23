package Zadania.coodingbat.warmup2;

/*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
Biorąc pod uwagę ciąg znaków, zwróć ciąg znaków składający się ze znaków o indeksach 0,1, 4,5, 8,9 ... więc „kocięta” dają „kien”.
        altPairs("kitten") → "kien"
        altPairs("Chocolate") → "Chole"
        altPairs("CodingHorror") → "Congrr"*/

public class Zadanie13 {
    public static void main(String[] args) {

        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));

        System.out.println(altPairs2("kitten"));
        System.out.println(altPairs2("Chocolate"));
        System.out.println(altPairs2("CodingHorror"));


    }

    public static String altPairs(String str) {
        if(str.length()>9){
            return String.valueOf(str.charAt(0)) +
                    str.charAt(1) +
                    str.charAt(4) +
                    str.charAt(5) +
                    str.charAt(8) +
                    str.charAt(9);
        } else if (str.length()>8) {
            return String.valueOf(str.charAt(0)) +
                    str.charAt(1) +
                    str.charAt(4) +
                    str.charAt(5) +
                    str.charAt(8);
        } else if (str.length()>5){
            return String.valueOf(str.charAt(0)) +
                    str.charAt(1) +
                    str.charAt(4) +
                    str.charAt(5);
        } else if (str.length()>4){
            return String.valueOf(str.charAt(0)) +
                    str.charAt(1) +
                    str.charAt(4);
        } else if (str.length()>1){
            return String.valueOf(str.charAt(0)) +
                    str.charAt(1);
        } else if (str.length()>0){
            return String.valueOf(str.charAt(0));
        }
        return "";
    }

    public static String altPairs2(String str){
        String result = "";
        for(int i=0, j=1; i<str.length()-1;i=i+4, j=j+4){
            result = result + str.charAt(i) + str.charAt(j);
        }
        return result;
    }

}
