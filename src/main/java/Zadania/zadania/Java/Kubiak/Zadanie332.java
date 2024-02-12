package Zadania.zadania.Java.Kubiak;

/*Napisz program, który wyświetla duże litery alfabetu od A do
        Z i od Z do A z wykorzystaniem pętli for.*/

public class Zadanie332 {
    public static void main(String[] args) {

        GeneratorLiterAdoZ();

    }
    public static void GeneratorLiterAdoZ(){
        char a = 'A';
        char z = 'Z';
        for(char i = a;i<=z;i++){
            System.out.print(i + " ");
        }
    }
}
