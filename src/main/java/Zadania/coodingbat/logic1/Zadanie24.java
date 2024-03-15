package Zadania.coodingbat.logic1;

/*Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value,
        increment one die to the next value, wrapping around to 1 if its value was 6.
Zwróć sumę dwóch 6-ściennych rzutów kostką, każdy z zakresu 1..6. Jeśli jednak wartość noDoubles jest prawdziwa, a dwie kostki wykazują tę samą wartość,
zwiększaj jedną kość do następnej wartości, zawijając do 1, jeśli jej wartość wynosiła 6
        withoutDoubles(2, 3, true) → 5
        withoutDoubles(3, 3, true) → 7
        withoutDoubles(3, 3, false) → 6*/

public class Zadanie24 {
    public static void main(String[] args) {

        System.out.println(withoutDoubles(2,3,true));
        System.out.println(withoutDoubles(3,3,true));
        System.out.println(withoutDoubles(3,3,false));


    }
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles==false){
            return die1+die2;
        } else if (noDoubles==true && die1<=5 && die2<=5 && die1!=die2) {
            return die1+die2;
        } else if (noDoubles==true && die1==die2 && die2!=6) {
            return die1+die2+1;
        } else if(noDoubles==true) {
            if(die1==6){
                return 7;
            }
        }
        return die1+die2;
    }

}
