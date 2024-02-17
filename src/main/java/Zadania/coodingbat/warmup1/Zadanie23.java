package Zadania.coodingbat.warmup1;

/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
Biorąc pod uwagę 2 wartości typu int, zwróć wartość najbliższą wartości 10 lub zwróć 0 w przypadku remisu. Należy zauważyć, że funkcja Math.abs(n) zwraca wartość bezwzględną liczby
        close10(8, 13) → 8
        close10(13, 8) → 8
        close10(13, 7) → 0*/

public class Zadanie23 {
    public static void main(String[] args) {

        System.out.println(close10(8,13));
        System.out.println(close10(13,8));
        System.out.println(close10(13,7));

    }
    public static int close10(int a, int b) {
        int x = Math.abs(10-a);
        int y = Math.abs(10-b);
        if(x == y){
            return 0;
        } if(x<y){
            return a;
        } else {
            return b;
        }
    }

}
