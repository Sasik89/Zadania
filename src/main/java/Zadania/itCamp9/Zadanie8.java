package Zadania.itCamp9;

//stworz tabele 10 elementową z wylosowanych w przedziale od 0 do 100 liczb tak by każda kolejna liczba była nie mniejsza od poprzedniej,
//zwóc uwagę na to by wylosowana pierwsza cyfra nie była bliska 100


import java.util.Random;

public class Zadanie8 {

    // TODO: 29.01.2024 Działa 
    
    public static void main(String[] args) {

    int[] tablica = new int[10];
    Random random = new Random();
    tablica[0] = random.nextInt(0,11);

        for (int i = 1; i < 10; i++) {
        while(true){
            int wylosowanaLiczba = random.nextInt(0,100);

            //sprwadza czy wylosowana liczba jest mniejsza od poprzedniej oraz czy różnica bezwzlędna międzynimi jest mniejsza niż 10

            if(tablica[i-1]<wylosowanaLiczba && Math.abs(tablica[i-1]-wylosowanaLiczba) <10) {
                tablica[i] = wylosowanaLiczba;
                break;
            }
            }
        }

        for(int element:tablica){
        System.out.print(element + " ");
    }
}
}
