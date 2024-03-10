package Zadania.coodingbat.logic1;

/*When squirrels get together for a party, they like to have cigars.
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Return true if the party with the given values is successful, or false otherwise.
Kiedy wiewiórki spotykają się na imprezie, lubią palić cygara.
Wiewiórkowa impreza jest udana, gdy liczba cygar wynosi od 40 do 60 włącznie.
Chyba że jest weekend, w którym to przypadku nie ma górnej granicy liczby cygar.
Zwróć wartość true, jeśli impreza z podanymi wartościami zakończy się sukcesem, lub false w przeciwnym razie.
cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true*/

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println(cigarParty(30,false));
        System.out.println(cigarParty(50,false));
        System.out.println(cigarParty(70,true));

    }
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if(cigars>=40 && cigars<=60){
            return true;
        } if(isWeekend==true && cigars>=40){
            return true;
        } else {
            return false;
        }
    }
}
