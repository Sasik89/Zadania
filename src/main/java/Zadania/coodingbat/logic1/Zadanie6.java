package Zadania.coodingbat.logic1;


/*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
return a string of the form "7:00" indicating when the alarm clock should ring.
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
Biorąc pod uwagę dzień tygodnia zakodowany jako 0=niedziela, 1=poniedziałek, 2=wtorek, ...6=sobota oraz wartość logiczną wskazującą, czy jesteśmy na wakacjach,
zwróć ciąg znaków w postaci „7:00” wskazujący, kiedy powinien zadzwonić budzik.
W dni powszednie alarm powinien wynosić „7:00”, a w weekendy „10:00”.
Chyba, że jesteśmy na wakacjach – wtedy w dni powszednie powinno być „10:00”, a w weekendy powinno być „wyłączone”.

        alarmClock(1, false) → "7:00"
        alarmClock(5, false) → "7:00"
        alarmClock(0, false) → "10:00"*/

public class Zadanie6 {
    public static void main(String[] args) {

        System.out.println(alarmClock(1,false));
        System.out.println(alarmClock(5,false));
        System.out.println(alarmClock(0,false));


    }
    public static String alarmClock(int day, boolean vacation) {
        if (vacation && day > 0 && day < 6) {
            return "10:00";
        }
        if (vacation && (day == 0 || day == 6)) {
            return "off";
        }
        if (!vacation && day > 0 && day < 6) {
            return "7:00";
        }
        return "10:00";
    }
}
