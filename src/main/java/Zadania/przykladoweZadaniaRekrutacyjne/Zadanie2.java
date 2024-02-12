package Zadania.przykladoweZadaniaRekrutacyjne;

//napisz wzór na silnię metodą zwykła i rekurencyjną

import java.util.function.ToDoubleBiFunction;

public class Zadanie2 {
    public static void main(String[] args) {

        silnia(5);
        System.out.println(silniaRekurencyjnie(5));

    }

    public static void silnia(int a) {
        int temp = 1;
        if (a == 1) {
            System.out.println(1);
        } else if (a < 1) {
            throw new IllegalArgumentException("Nie ma silni z liczb mniejszych od 1");
        } else if (a > 1) {
            for (int i = 1; i <= a; i++) {
                int silnia = temp * i;
                temp = silnia;
            }
            System.out.println("Silnia z: " + a + " wynosi: " + temp);
        }
    }

        //TODO dodać być możę jakieś wyjątki
        public static int silniaRekurencyjnie(int a){
                if(a > 1){
                    return a * silniaRekurencyjnie(a-1);
                } else if (a == 1) {
                    return 1;
                } else {
                    return 0;
                }
        }
    }

