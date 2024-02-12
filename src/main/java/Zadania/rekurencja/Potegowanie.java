package Zadania.rekurencja;

public class Potegowanie {
    public static void main(String[] args) {

        System.out.println(power(2,20));

    }

    public static int power(int podstawa, int wykladnik){
        if(wykladnik==0){
            return 1;
        }
        return podstawa * power(podstawa, wykladnik-1);
    }
}
