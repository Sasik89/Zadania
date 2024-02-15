package Zadania.coodingbat.warmup1;
/*Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
If the string length is less than 2, use whatever chars are there.
Biorąc pod uwagę ciąg, weź pierwsze 2 znaki i zwróć ciąg z 2 znakami dodanymi zarówno z przodu, jak i z tyłu, więc „kotek” daje „kikittenki”.
Jeśli długość ciągu jest mniejsza niż 2, użyj dowolnych znaków.
        front22("kitten") → "kikittenki"
        front22("Ha") → "HaHaHa"
        front22("abc") → "ababcab"*/
public class Zadanie13 {
    public static void main(String[] args) {

        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));

    }
    public static String front22(String str) {
        int liczba=2;
        if(str.length()==1) {
            liczba=1;
        } else if (str.length()==0) {
            return "";
        }
        String frontLetter = str.substring(0,liczba);
        return new StringBuilder()
                .append(frontLetter)
                .append(str)
                .append(frontLetter).toString();
    }
}
