package Zadania.itCamp9;

//napisz program który wygeneruje tablice w której kolejne liczby sa o siebie 2 wieksze

public class Zadanie1 {
    public static void main(String[] args) {

        int[] tab = new int[20];
        for(int i = 0, value = 2; i<20; i++, value = value + 2 ){
            tab[i] = value;
            System.out.println(tab[i]);
        }
    }
}
