package Zadania.coodingbat.logic1;

/*You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10,
and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no).
Otherwise the result is 1 (maybe).
Ty i twoja randka próbujecie zdobyć stolik w restauracji. Parametr „ty” określa stylowość Twoich ubrań w przedziale 0..10,
a „randka” to styl ubrań Twojej randki. Wynik uzyskania tabeli jest kodowany jako wartość int, gdzie 0=nie, 1=może, 2=tak.
Jeśli któreś z was jest bardzo stylowe, 8 lub więcej, wynik wynosi 2 (tak). Z wyjątkiem sytuacji, gdy którykolwiek z was ma styl 2 lub mniejszy, wówczas wynikiem jest 0 (nie).
W przeciwnym razie wynikiem będzie 1 (być może).
        dateFashion(5, 10) → 2
        dateFashion(5, 2) → 0
        dateFashion(5, 5) → 1*/

public class Zadanie2 {
    public static void main(String[] args) {

        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(5, 2));
        System.out.println(dateFashion(5, 5));

    }
    public static int dateFashion(int you, int date) {
        if(you>=8 && date>2 || you>2 && date>=8){
            return 2;
        } if(you<=2 || date<=2) {
            return 0;
        } else {
            return 1;
        }
    }
}
