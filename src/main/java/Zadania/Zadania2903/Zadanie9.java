package Zadania.Zadania2903;

/*  Napisac program w którym są 3 zmienne:
 s - liczba całkowita - oznacza pierwszą liczbę ciągu arytmetycznego
 k - liczba całkowita - oznacza krok w ciągu arytmetycznym
 n - liczba całkowita - oznacza ilość elementów ciągu.
 Program ma zwracać sumę elementów takiego ciągu. Przykład:
 s = 3, k = 5, n = 4
 program ma wygenerować 4 elementy (n), które wyglądają dla podanych s i k tak:
3, 8, 13, 18
 następnie je sumuje i podaje wynik: 42.

an=a1+(n−1)⋅r*/

public class Zadanie9 {

// TODO: 24.01.2024 Działa

    public static void main(String[] args) {

        CiagArytmetyczny(3,5,4);

    }

        public static void CiagArytmetyczny(int s, int k, int n){
        int result = 0;
            System.out.print("Poszczególne liczby ciągu dla " + n + " elementów wynoszą: ");
            for(int i=1; i<=n; i++){
                int wynik = s + (i-1)*k;
                result = result + wynik;
                System.out.print(wynik + " ");
            }
            System.out.println("Suma ciagu wynosi " + result);
        }


}
