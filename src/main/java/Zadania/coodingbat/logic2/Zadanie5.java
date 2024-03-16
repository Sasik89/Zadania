package Zadania.coodingbat.logic2;


/*For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
Given 3 ints, a b c, return the sum of their rounded values.
To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
Write the helper entirely below and at the same indent level as roundSum().
W przypadku tego problemu zaokrąglimy wartość int w górę do następnej wielokrotności 10, jeśli jej skrajna cyfra wynosi 5 lub więcej, więc 15 zaokrągla do 20.
Alternatywnie zaokrąglij w dół do poprzedniej wielokrotności 10, jeśli jej skrajna cyfra jest mniejsza niż 5, więc 12 zaokrągla w dół do 10.
Biorąc pod uwagę 3 inty, a b c, zwróć sumę ich zaokrąglonych wartości.
Aby uniknąć powtarzania kodu, napisz osobny pomocnik „public int round10(int num) {” i wywołaj go 3 razy.
Zapisz pomocnika całkowicie poniżej i na tym samym poziomie wcięcia co roundSum().
        roundSum(16, 17, 18) → 60
        roundSum(12, 13, 14) → 30
        roundSum(6, 4, 4) → 10*/

public class Zadanie5 {
    public static void main(String[] args) {

        System.out.println(roundSum(16,17,18));
        System.out.println(roundSum(12,13,14));
        System.out.println(roundSum(6,4,4));

    }
    public static int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }
    public static int round10(int num){
        if(num%10>=5){
            return num+10-num%10;
        } else{
            return num-num%10;
        }

    }
}
