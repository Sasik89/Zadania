package Zadania.itCamp9;

public class Zadanie4 {
    public static void main(String[] args) {

        int[] tablica = new int[100];

        for (int i = 0; i < 100; i++) {
            tablica[i] = i+1;
            }
        for(int element : tablica) {
            System.out.print(element);
            if(element % 3 == 0){
                System.out.print(" Fizz");
            }
            if(element % 5 == 0){
                System.out.print(" Bazz ");
            }
            System.out.println();
        }
    }
}
