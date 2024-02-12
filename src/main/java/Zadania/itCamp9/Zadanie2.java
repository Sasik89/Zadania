package Zadania.itCamp9;

//Wygeneruj tablice od 1 do 1000 i wypisz tylko liczby ktore dziela sie przez 2 i 3

public class Zadanie2 {
    public static void main(String[] args) {
        int[] tablica = new int[1000];
        for (int i = 0; i < 1000; i++) {
            tablica[i] = i + 1;
            if ((tablica[i] % 3 == 0) && (tablica[i] %2 == 0)){
                System.out.println(tablica[i]);
            }
        }
        //lub
/*        for(int element : tablica){
            if(element %2 ==0 && element%3 == 0){
                System.out.println(element);
            }
        }*/
    }
}
